package avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SchemaPage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1428348052592754392L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SchemaPage\",\"fields\":[{\"name\":\"indexList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Index\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"desc\",\"type\":\"string\"},{\"name\":\"indexFieldList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"order\",\"type\":\"string\"}]}}}]}}},{\"name\":\"fieldList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Field\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"desc\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"}]}}},{\"name\":\"ddl\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SchemaPage> ENCODER =
      new BinaryMessageEncoder<SchemaPage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SchemaPage> DECODER =
      new BinaryMessageDecoder<SchemaPage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<SchemaPage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<SchemaPage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SchemaPage>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this SchemaPage to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a SchemaPage from a ByteBuffer. */
  public static SchemaPage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.util.List<Index> indexList;
  @Deprecated public java.util.List<Field> fieldList;
  @Deprecated public java.lang.CharSequence ddl;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SchemaPage() {}

  /**
   * All-args constructor.
   * @param indexList The new value for indexList
   * @param fieldList The new value for fieldList
   * @param ddl The new value for ddl
   */
  public SchemaPage(java.util.List<Index> indexList, java.util.List<Field> fieldList, java.lang.CharSequence ddl) {
    this.indexList = indexList;
    this.fieldList = fieldList;
    this.ddl = ddl;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return indexList;
    case 1: return fieldList;
    case 2: return ddl;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: indexList = (java.util.List<Index>)value$; break;
    case 1: fieldList = (java.util.List<Field>)value$; break;
    case 2: ddl = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'indexList' field.
   * @return The value of the 'indexList' field.
   */
  public java.util.List<Index> getIndexList() {
    return indexList;
  }

  /**
   * Sets the value of the 'indexList' field.
   * @param value the value to set.
   */
  public void setIndexList(java.util.List<Index> value) {
    this.indexList = value;
  }

  /**
   * Gets the value of the 'fieldList' field.
   * @return The value of the 'fieldList' field.
   */
  public java.util.List<Field> getFieldList() {
    return fieldList;
  }

  /**
   * Sets the value of the 'fieldList' field.
   * @param value the value to set.
   */
  public void setFieldList(java.util.List<Field> value) {
    this.fieldList = value;
  }

  /**
   * Gets the value of the 'ddl' field.
   * @return The value of the 'ddl' field.
   */
  public java.lang.CharSequence getDdl() {
    return ddl;
  }

  /**
   * Sets the value of the 'ddl' field.
   * @param value the value to set.
   */
  public void setDdl(java.lang.CharSequence value) {
    this.ddl = value;
  }

  /**
   * Creates a new SchemaPage RecordBuilder.
   * @return A new SchemaPage RecordBuilder
   */
  public static SchemaPage.Builder newBuilder() {
    return new SchemaPage.Builder();
  }

  /**
   * Creates a new SchemaPage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SchemaPage RecordBuilder
   */
  public static SchemaPage.Builder newBuilder(SchemaPage.Builder other) {
    return new SchemaPage.Builder(other);
  }

  /**
   * Creates a new SchemaPage RecordBuilder by copying an existing SchemaPage instance.
   * @param other The existing instance to copy.
   * @return A new SchemaPage RecordBuilder
   */
  public static SchemaPage.Builder newBuilder(SchemaPage other) {
    return new SchemaPage.Builder(other);
  }

  /**
   * RecordBuilder for SchemaPage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SchemaPage>
    implements org.apache.avro.data.RecordBuilder<SchemaPage> {

    private java.util.List<Index> indexList;
    private java.util.List<Field> fieldList;
    private java.lang.CharSequence ddl;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(SchemaPage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.indexList)) {
        this.indexList = data().deepCopy(fields()[0].schema(), other.indexList);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fieldList)) {
        this.fieldList = data().deepCopy(fields()[1].schema(), other.fieldList);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ddl)) {
        this.ddl = data().deepCopy(fields()[2].schema(), other.ddl);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing SchemaPage instance
     * @param other The existing instance to copy.
     */
    private Builder(SchemaPage other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.indexList)) {
        this.indexList = data().deepCopy(fields()[0].schema(), other.indexList);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fieldList)) {
        this.fieldList = data().deepCopy(fields()[1].schema(), other.fieldList);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ddl)) {
        this.ddl = data().deepCopy(fields()[2].schema(), other.ddl);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'indexList' field.
      * @return The value.
      */
    public java.util.List<Index> getIndexList() {
      return indexList;
    }

    /**
      * Sets the value of the 'indexList' field.
      * @param value The value of 'indexList'.
      * @return This builder.
      */
    public SchemaPage.Builder setIndexList(java.util.List<Index> value) {
      validate(fields()[0], value);
      this.indexList = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'indexList' field has been set.
      * @return True if the 'indexList' field has been set, false otherwise.
      */
    public boolean hasIndexList() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'indexList' field.
      * @return This builder.
      */
    public SchemaPage.Builder clearIndexList() {
      indexList = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'fieldList' field.
      * @return The value.
      */
    public java.util.List<Field> getFieldList() {
      return fieldList;
    }

    /**
      * Sets the value of the 'fieldList' field.
      * @param value The value of 'fieldList'.
      * @return This builder.
      */
    public SchemaPage.Builder setFieldList(java.util.List<Field> value) {
      validate(fields()[1], value);
      this.fieldList = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'fieldList' field has been set.
      * @return True if the 'fieldList' field has been set, false otherwise.
      */
    public boolean hasFieldList() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'fieldList' field.
      * @return This builder.
      */
    public SchemaPage.Builder clearFieldList() {
      fieldList = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ddl' field.
      * @return The value.
      */
    public java.lang.CharSequence getDdl() {
      return ddl;
    }

    /**
      * Sets the value of the 'ddl' field.
      * @param value The value of 'ddl'.
      * @return This builder.
      */
    public SchemaPage.Builder setDdl(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ddl = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ddl' field has been set.
      * @return True if the 'ddl' field has been set, false otherwise.
      */
    public boolean hasDdl() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ddl' field.
      * @return This builder.
      */
    public SchemaPage.Builder clearDdl() {
      ddl = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SchemaPage build() {
      try {
        SchemaPage record = new SchemaPage();
        record.indexList = fieldSetFlags()[0] ? this.indexList : (java.util.List<Index>) defaultValue(fields()[0]);
        record.fieldList = fieldSetFlags()[1] ? this.fieldList : (java.util.List<Field>) defaultValue(fields()[1]);
        record.ddl = fieldSetFlags()[2] ? this.ddl : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SchemaPage>
    WRITER$ = (org.apache.avro.io.DatumWriter<SchemaPage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SchemaPage>
    READER$ = (org.apache.avro.io.DatumReader<SchemaPage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
