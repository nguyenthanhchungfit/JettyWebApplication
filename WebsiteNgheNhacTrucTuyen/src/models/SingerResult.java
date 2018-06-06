/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package models;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-06-06")
public class SingerResult implements org.apache.thrift.TBase<SingerResult, SingerResult._Fields>, java.io.Serializable, Cloneable, Comparable<SingerResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SingerResult");

  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField SINGER_FIELD_DESC = new org.apache.thrift.protocol.TField("singer", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SingerResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SingerResultTupleSchemeFactory();

  public short result; // required
  public Singer singer; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESULT((short)1, "result"),
    SINGER((short)2, "singer");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESULT
          return RESULT;
        case 2: // SINGER
          return SINGER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RESULT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SINGER};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.SINGER, new org.apache.thrift.meta_data.FieldMetaData("singer", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Singer.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SingerResult.class, metaDataMap);
  }

  public SingerResult() {
    this.result = (short)0;

  }

  public SingerResult(
    short result)
  {
    this();
    this.result = result;
    setResultIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SingerResult(SingerResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.result = other.result;
    if (other.isSetSinger()) {
      this.singer = new Singer(other.singer);
    }
  }

  public SingerResult deepCopy() {
    return new SingerResult(this);
  }

  @Override
  public void clear() {
    this.result = (short)0;

    this.singer = null;
  }

  public short getResult() {
    return this.result;
  }

  public SingerResult setResult(short result) {
    this.result = result;
    setResultIsSet(true);
    return this;
  }

  public void unsetResult() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  public void setResultIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RESULT_ISSET_ID, value);
  }

  public Singer getSinger() {
    return this.singer;
  }

  public SingerResult setSinger(Singer singer) {
    this.singer = singer;
    return this;
  }

  public void unsetSinger() {
    this.singer = null;
  }

  /** Returns true if field singer is set (has been assigned a value) and false otherwise */
  public boolean isSetSinger() {
    return this.singer != null;
  }

  public void setSingerIsSet(boolean value) {
    if (!value) {
      this.singer = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((java.lang.Short)value);
      }
      break;

    case SINGER:
      if (value == null) {
        unsetSinger();
      } else {
        setSinger((Singer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return getResult();

    case SINGER:
      return getSinger();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RESULT:
      return isSetResult();
    case SINGER:
      return isSetSinger();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SingerResult)
      return this.equals((SingerResult)that);
    return false;
  }

  public boolean equals(SingerResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_result = true;
    boolean that_present_result = true;
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (this.result != that.result)
        return false;
    }

    boolean this_present_singer = true && this.isSetSinger();
    boolean that_present_singer = true && that.isSetSinger();
    if (this_present_singer || that_present_singer) {
      if (!(this_present_singer && that_present_singer))
        return false;
      if (!this.singer.equals(that.singer))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + result;

    hashCode = hashCode * 8191 + ((isSetSinger()) ? 131071 : 524287);
    if (isSetSinger())
      hashCode = hashCode * 8191 + singer.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SingerResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, other.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSinger()).compareTo(other.isSetSinger());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSinger()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.singer, other.singer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SingerResult(");
    boolean first = true;

    sb.append("result:");
    sb.append(this.result);
    first = false;
    if (isSetSinger()) {
      if (!first) sb.append(", ");
      sb.append("singer:");
      if (this.singer == null) {
        sb.append("null");
      } else {
        sb.append(this.singer);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'result' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (singer != null) {
      singer.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SingerResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SingerResultStandardScheme getScheme() {
      return new SingerResultStandardScheme();
    }
  }

  private static class SingerResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<SingerResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SingerResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.result = iprot.readI16();
              struct.setResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SINGER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.singer = new Singer();
              struct.singer.read(iprot);
              struct.setSingerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetResult()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'result' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SingerResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      oprot.writeI16(struct.result);
      oprot.writeFieldEnd();
      if (struct.singer != null) {
        if (struct.isSetSinger()) {
          oprot.writeFieldBegin(SINGER_FIELD_DESC);
          struct.singer.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SingerResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SingerResultTupleScheme getScheme() {
      return new SingerResultTupleScheme();
    }
  }

  private static class SingerResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<SingerResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SingerResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI16(struct.result);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSinger()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSinger()) {
        struct.singer.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SingerResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.result = iprot.readI16();
      struct.setResultIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.singer = new Singer();
        struct.singer.read(iprot);
        struct.setSingerIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

