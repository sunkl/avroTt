package avro;


import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by lenovo on 2018/6/3.
 */
public class AvroSeri {
    public static  void main(String[] args) throws IOException {
//            File file = new File("users.avro");
//            SchemaPage schemaPage = new SchemaPage();
//            schemaPage.setDdl("ddl");
//            Field field = new Field();
//            field.setDesc("dsfsd");
//            field.setName("dsf");
//            field.setType("dsf");
//            IndexField indexField = new IndexField();
//            indexField.setName("sdf");
//            indexField.setOrder("dsf");
//            Index index = new Index();
//            index.setDesc("sdfsd");
//            index.setName("dsfsd");
//            index.setIndexFieldList(Arrays.asList(indexField));
//            schemaPage.setFieldList(Arrays.asList(field));
//            schemaPage.setIndexList(Arrays.asList(index));
//            Schema schema = new Schema.Parser().parse(AvroSeri.class.getResourceAsStream("/schemaPage.avsc"));
//            DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<GenericRecord>(schema);
//            DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<GenericRecord>(datumWriter);
//            dataFileWriter.create(schema, file);
//            dataFileWriter.append(schemaPage);
//            dataFileWriter.close();

            Schema schema = new Schema.Parser().parse(AvroSeri.class.getResourceAsStream("/schemaPage.avsc"));
            DatumReader<GenericRecord> datumReader = new GenericDatumReader<GenericRecord>(schema);
            DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(new File("users.avro"), datumReader);
            GenericRecord user = null;
            while (dataFileReader.hasNext()) {
                user = dataFileReader.next(user);
                System.out.println(user);
            }

    }
}
