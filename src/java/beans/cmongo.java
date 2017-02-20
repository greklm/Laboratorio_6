/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
/**
 *
 * @author USUARIO
 */
public class cmongo {
    public MongoClient cliente;
    public MongoDatabase baseDatos;
    public DB bd;
    
    public cmongo(String ip,int puerto,String bd)
    {
        cliente=new MongoClient(ip,puerto);
        baseDatos=cliente.getDatabase(bd);
    }
    public cmongo()
    {
        cliente=new MongoClient("127.0.0.1",27017);
        baseDatos=cliente.getDatabase("bdClinica");
        bd=cliente.getDB("bdClinica");
    }
    
    public DBCollection Documentos(String tabla)
    {
        DBCollection colecciones=bd.getCollection(tabla);
        return colecciones;
    }
    
    public Iterable<String> Colecciones()
    {
        Iterable<String> colecciones=baseDatos.listCollectionNames();
        return colecciones;
    }
    public void Insertar(String Coleccion,String[] Parametros, String[] Atributos)
    {
        DBCollection coll= bd.getCollection(Coleccion);
        BasicDBObject doc = new BasicDBObject(Parametros[0], Atributos[0]);
        
        for(int i =1;i<Atributos.length;i++)
        {
            doc = doc.append(Parametros[i], Atributos[i]);
        }
        
        //System.out.println("Data Display");
        coll.insert(doc);
        DBCursor cursor = coll.find();
        try {
           while(cursor.hasNext()) {
               System.out.println(cursor.next());
           }
        } finally {
           //mongoClient.dropDatabase("test");
           cursor.close();
        }
    }
    public void Eliminar(String Coleccion,String Parametro,String Atributo)
    {
         MongoCollection<Document> miColeccion = baseDatos.getCollection(Coleccion);
            miColeccion.deleteOne(Filters.eq(Parametro,Atributo));
    }
    public void Actualizar(String Coleccion,String[] Parametros,String Atributos[])
    {
        Eliminar(Coleccion,Parametros[0],Atributos[0]);
        Insertar(Coleccion,Parametros,Atributos);
    }
    
    public DBCursor Registro(String[] Filtros,String[] Valores,String Coleccion)
    {
        BasicDBObject whereQuery = new BasicDBObject();
        DBCollection colecciones=bd.getCollection(Coleccion);
        for(int i=0;i<Filtros.length;i++)
        {
         whereQuery.put(Filtros[i], Valores[i]);   
        }
        
        DBCursor cursor = colecciones.find(whereQuery);
         return cursor;
    }
}