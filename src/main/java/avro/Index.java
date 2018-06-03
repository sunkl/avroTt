package avro;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Index extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6864954386152560006L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Index\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"desc\",\"type\":\"string\"},{\"name\":\"indexFieldList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"order\",\"type\":\"string\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Index> ENCODER =
      new BinaryMessageEncoder<Index>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Index> DECODER =
      new BinaryMessageDecoder<Index>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Index> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Index> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Index>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Index to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Index from a ByteBuffer. */
  public static Index fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence desc;
  @Deprecated public java.util.List<IndexField> indexFieldList;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Index() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param desc The new value for desc
   * @param indexFieldList The new value for indexFieldList
   */
  public Index(java.lang.CharSequence name, java.lang.CharSequence desc, java.util.List<IndexField> indexFieldList) {
    this.name = name;
    this.desc = desc;
    this.indexFieldList = indexFieldList;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return desc;
    case 2: return indexFieldList;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: desc = (java.lang.CharSequence)value$; break;
    case 2: indexFieldList = (java.util.List<IndexField>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'desc' field.
   * @return The value of the 'desc' field.
   */
  public java.lang.CharSequence getDesc() {
    return desc;
  }

  /**
   * Sets the value of the 'desc' field.
   * @param value the value to set.
   */
  public void setDesc(java.lang.CharSequence value) {
    this.desc = value;
  }

  /**
   * Gets the value of the 'indexFieldList' field.
   * @return The value of the 'indexFieldList' field.
   */
  public java.util.List<IndexField> getIndexFieldList() {
    return indexFieldList;
  }

  /**
   * Sets the value of the 'indexFieldList' field.
   * @param value the value to set.
   */
  public void setIndexFieldList(java.util.List<IndexField> value) {
    this.indexFieldList = value;
  }

  /**
   * Creates a new Index RecordBuilder.
   * @return A new Index RecordBuilder
   */
  public static Index.Builder newBuilder() {
    return new Index.Builder();
  }

  /**
   * Creates a new Index RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Index RecordBuilder
   */
  public static Index.Builder newBuilder(Index.Builder other) {
    return new Index.Builder(other);
  }

  /**
   * Creates a new Index RecordBuilder by copying an existing Index instance.
   * @param other The existing instance to copy.
   * @return A new Index RecordBuilder
   */
  public static Index.Builder newBuilder(Index other) {
    return new Index.Builder(other);
  }

  /**
   * RecordBuilder for Index instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Index>
    implements org.apache.avro.data.RecordBuilder<Index> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence desc;
    private java.util.List<IndexField> indexFieldList;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Index.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.desc)) {
        this.desc = data().deepCopy(fields()[1].schema(), other.desc);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.indexFieldList)) {
        this.indexFieldList = data().deepCopy(fields()[2].schema(), other.indexFieldList);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Index instance
     * @param other The existing instance to copy.
     */
    private Builder(Index other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.desc)) {
        this.desc = data().deepCopy(fields()[1].schema(), other.desc);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.indexFieldList)) {
        this.indexFieldList = data().deepCopy(fields()[2].schema(), other.indexFieldList);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public Index.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public Index.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'desc' field.
      * @return The value.
      */
    public java.lang.CharSequence getDesc() {
      return desc;
    }

    /**
      * Sets the value of the 'desc' field.
      * @param value The value of 'desc'.
      * @return This builder.
      */
    public Index.Builder setDesc(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.desc = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'desc' field has been set.
      * @return True if the 'desc' field has been set, false otherwise.
      */
    public boolean hasDesc() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'desc' field.
      * @return This builder.
      */
    public Index.Builder clearDesc() {
      desc = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'indexFieldList' field.
      * @return The value.
      */
    public java.util.List<IndexField> getIndexFieldList() {
      return indexFieldList;
    }

    /**
      * Sets the value of the 'indexFieldList' field.
      * @param value The value of 'indexFieldList'.
      * @return This builder.
      */
    public Index.Builder setIndexFieldList(java.util.List<IndexField> value) {
      validate(fields()[2], value);
      this.indexFieldList = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'indexFieldList' field has been set.
      * @return True if the 'indexFieldList' field has been set, false otherwise.
      */
    public boolean hasIndexFieldList() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'indexFieldList' field.
      * @return This builder.
      */
    public Index.Builder clearIndexFieldList() {
      indexFieldList = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Index build() {
      try {
        Index record = new Index();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.desc = fieldSetFlags()[1] ? this.desc : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.indexFieldList = fieldSetFlags()[2] ? this.indexFieldList : (java.util.List<IndexField>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Index>
    WRITER$ = (org.apache.avro.io.DatumWriter<Index>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Index>
    READER$ = (org.apache.avro.io.DatumReader<Index>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
