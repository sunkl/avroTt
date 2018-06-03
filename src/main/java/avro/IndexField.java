package avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class IndexField extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8234874194143616174L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IndexField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"order\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<IndexField> ENCODER =
      new BinaryMessageEncoder<IndexField>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<IndexField> DECODER =
      new BinaryMessageDecoder<IndexField>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<IndexField> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<IndexField> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<IndexField>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this IndexField to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a IndexField from a ByteBuffer. */
  public static IndexField fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence order;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IndexField() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param order The new value for order
   */
  public IndexField(java.lang.CharSequence name, java.lang.CharSequence order) {
    this.name = name;
    this.order = order;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return order;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: order = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'order' field.
   * @return The value of the 'order' field.
   */
  public java.lang.CharSequence getOrder() {
    return order;
  }

  /**
   * Sets the value of the 'order' field.
   * @param value the value to set.
   */
  public void setOrder(java.lang.CharSequence value) {
    this.order = value;
  }

  /**
   * Creates a new IndexField RecordBuilder.
   * @return A new IndexField RecordBuilder
   */
  public static IndexField.Builder newBuilder() {
    return new IndexField.Builder();
  }

  /**
   * Creates a new IndexField RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IndexField RecordBuilder
   */
  public static IndexField.Builder newBuilder(IndexField.Builder other) {
    return new IndexField.Builder(other);
  }

  /**
   * Creates a new IndexField RecordBuilder by copying an existing IndexField instance.
   * @param other The existing instance to copy.
   * @return A new IndexField RecordBuilder
   */
  public static IndexField.Builder newBuilder(IndexField other) {
    return new IndexField.Builder(other);
  }

  /**
   * RecordBuilder for IndexField instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IndexField>
    implements org.apache.avro.data.RecordBuilder<IndexField> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence order;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(IndexField.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.order)) {
        this.order = data().deepCopy(fields()[1].schema(), other.order);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing IndexField instance
     * @param other The existing instance to copy.
     */
    private Builder(IndexField other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.order)) {
        this.order = data().deepCopy(fields()[1].schema(), other.order);
        fieldSetFlags()[1] = true;
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
    public IndexField.Builder setName(java.lang.CharSequence value) {
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
    public IndexField.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'order' field.
      * @return The value.
      */
    public java.lang.CharSequence getOrder() {
      return order;
    }

    /**
      * Sets the value of the 'order' field.
      * @param value The value of 'order'.
      * @return This builder.
      */
    public IndexField.Builder setOrder(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.order = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'order' field has been set.
      * @return True if the 'order' field has been set, false otherwise.
      */
    public boolean hasOrder() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'order' field.
      * @return This builder.
      */
    public IndexField.Builder clearOrder() {
      order = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public IndexField build() {
      try {
        IndexField record = new IndexField();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.order = fieldSetFlags()[1] ? this.order : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<IndexField>
    WRITER$ = (org.apache.avro.io.DatumWriter<IndexField>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<IndexField>
    READER$ = (org.apache.avro.io.DatumReader<IndexField>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
