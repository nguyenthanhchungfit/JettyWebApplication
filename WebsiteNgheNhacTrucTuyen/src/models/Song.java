/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package models;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-06-04")
public class Song implements org.apache.thrift.TBase<Song, Song._Fields>, java.io.Serializable, Cloneable, Comparable<Song> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Song");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ALBUM_FIELD_DESC = new org.apache.thrift.protocol.TField("album", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LYRICS_FIELD_DESC = new org.apache.thrift.protocol.TField("lyrics", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField COMPOSERS_FIELD_DESC = new org.apache.thrift.protocol.TField("composers", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField KINDS_FIELD_DESC = new org.apache.thrift.protocol.TField("kinds", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField SINGERS_FIELD_DESC = new org.apache.thrift.protocol.TField("singers", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SongStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SongTupleSchemeFactory();

  public java.lang.String id; // required
  public java.lang.String name; // required
  public java.lang.String album; // required
  public java.util.List<java.lang.String> lyrics; // required
  public java.util.List<java.lang.String> composers; // required
  public java.util.List<java.lang.String> kinds; // required
  public java.util.List<Singer> singers; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    ALBUM((short)3, "album"),
    LYRICS((short)4, "lyrics"),
    COMPOSERS((short)5, "composers"),
    KINDS((short)6, "kinds"),
    SINGERS((short)7, "singers");

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
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // ALBUM
          return ALBUM;
        case 4: // LYRICS
          return LYRICS;
        case 5: // COMPOSERS
          return COMPOSERS;
        case 6: // KINDS
          return KINDS;
        case 7: // SINGERS
          return SINGERS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALBUM, new org.apache.thrift.meta_data.FieldMetaData("album", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LYRICS, new org.apache.thrift.meta_data.FieldMetaData("lyrics", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.COMPOSERS, new org.apache.thrift.meta_data.FieldMetaData("composers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.KINDS, new org.apache.thrift.meta_data.FieldMetaData("kinds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SINGERS, new org.apache.thrift.meta_data.FieldMetaData("singers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Singer.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Song.class, metaDataMap);
  }

  public Song() {
  }

  public Song(
    java.lang.String id,
    java.lang.String name,
    java.lang.String album,
    java.util.List<java.lang.String> lyrics,
    java.util.List<java.lang.String> composers,
    java.util.List<java.lang.String> kinds,
    java.util.List<Singer> singers)
  {
    this();
    this.id = id;
    this.name = name;
    this.album = album;
    this.lyrics = lyrics;
    this.composers = composers;
    this.kinds = kinds;
    this.singers = singers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Song(Song other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetAlbum()) {
      this.album = other.album;
    }
    if (other.isSetLyrics()) {
      java.util.List<java.lang.String> __this__lyrics = new java.util.ArrayList<java.lang.String>(other.lyrics);
      this.lyrics = __this__lyrics;
    }
    if (other.isSetComposers()) {
      java.util.List<java.lang.String> __this__composers = new java.util.ArrayList<java.lang.String>(other.composers);
      this.composers = __this__composers;
    }
    if (other.isSetKinds()) {
      java.util.List<java.lang.String> __this__kinds = new java.util.ArrayList<java.lang.String>(other.kinds);
      this.kinds = __this__kinds;
    }
    if (other.isSetSingers()) {
      java.util.List<Singer> __this__singers = new java.util.ArrayList<Singer>(other.singers.size());
      for (Singer other_element : other.singers) {
        __this__singers.add(new Singer(other_element));
      }
      this.singers = __this__singers;
    }
  }

  public Song deepCopy() {
    return new Song(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.name = null;
    this.album = null;
    this.lyrics = null;
    this.composers = null;
    this.kinds = null;
    this.singers = null;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public Song setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public java.lang.String getName() {
    return this.name;
  }

  public Song setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getAlbum() {
    return this.album;
  }

  public Song setAlbum(java.lang.String album) {
    this.album = album;
    return this;
  }

  public void unsetAlbum() {
    this.album = null;
  }

  /** Returns true if field album is set (has been assigned a value) and false otherwise */
  public boolean isSetAlbum() {
    return this.album != null;
  }

  public void setAlbumIsSet(boolean value) {
    if (!value) {
      this.album = null;
    }
  }

  public int getLyricsSize() {
    return (this.lyrics == null) ? 0 : this.lyrics.size();
  }

  public java.util.Iterator<java.lang.String> getLyricsIterator() {
    return (this.lyrics == null) ? null : this.lyrics.iterator();
  }

  public void addToLyrics(java.lang.String elem) {
    if (this.lyrics == null) {
      this.lyrics = new java.util.ArrayList<java.lang.String>();
    }
    this.lyrics.add(elem);
  }

  public java.util.List<java.lang.String> getLyrics() {
    return this.lyrics;
  }

  public Song setLyrics(java.util.List<java.lang.String> lyrics) {
    this.lyrics = lyrics;
    return this;
  }

  public void unsetLyrics() {
    this.lyrics = null;
  }

  /** Returns true if field lyrics is set (has been assigned a value) and false otherwise */
  public boolean isSetLyrics() {
    return this.lyrics != null;
  }

  public void setLyricsIsSet(boolean value) {
    if (!value) {
      this.lyrics = null;
    }
  }

  public int getComposersSize() {
    return (this.composers == null) ? 0 : this.composers.size();
  }

  public java.util.Iterator<java.lang.String> getComposersIterator() {
    return (this.composers == null) ? null : this.composers.iterator();
  }

  public void addToComposers(java.lang.String elem) {
    if (this.composers == null) {
      this.composers = new java.util.ArrayList<java.lang.String>();
    }
    this.composers.add(elem);
  }

  public java.util.List<java.lang.String> getComposers() {
    return this.composers;
  }

  public Song setComposers(java.util.List<java.lang.String> composers) {
    this.composers = composers;
    return this;
  }

  public void unsetComposers() {
    this.composers = null;
  }

  /** Returns true if field composers is set (has been assigned a value) and false otherwise */
  public boolean isSetComposers() {
    return this.composers != null;
  }

  public void setComposersIsSet(boolean value) {
    if (!value) {
      this.composers = null;
    }
  }

  public int getKindsSize() {
    return (this.kinds == null) ? 0 : this.kinds.size();
  }

  public java.util.Iterator<java.lang.String> getKindsIterator() {
    return (this.kinds == null) ? null : this.kinds.iterator();
  }

  public void addToKinds(java.lang.String elem) {
    if (this.kinds == null) {
      this.kinds = new java.util.ArrayList<java.lang.String>();
    }
    this.kinds.add(elem);
  }

  public java.util.List<java.lang.String> getKinds() {
    return this.kinds;
  }

  public Song setKinds(java.util.List<java.lang.String> kinds) {
    this.kinds = kinds;
    return this;
  }

  public void unsetKinds() {
    this.kinds = null;
  }

  /** Returns true if field kinds is set (has been assigned a value) and false otherwise */
  public boolean isSetKinds() {
    return this.kinds != null;
  }

  public void setKindsIsSet(boolean value) {
    if (!value) {
      this.kinds = null;
    }
  }

  public int getSingersSize() {
    return (this.singers == null) ? 0 : this.singers.size();
  }

  public java.util.Iterator<Singer> getSingersIterator() {
    return (this.singers == null) ? null : this.singers.iterator();
  }

  public void addToSingers(Singer elem) {
    if (this.singers == null) {
      this.singers = new java.util.ArrayList<Singer>();
    }
    this.singers.add(elem);
  }

  public java.util.List<Singer> getSingers() {
    return this.singers;
  }

  public Song setSingers(java.util.List<Singer> singers) {
    this.singers = singers;
    return this;
  }

  public void unsetSingers() {
    this.singers = null;
  }

  /** Returns true if field singers is set (has been assigned a value) and false otherwise */
  public boolean isSetSingers() {
    return this.singers != null;
  }

  public void setSingersIsSet(boolean value) {
    if (!value) {
      this.singers = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case ALBUM:
      if (value == null) {
        unsetAlbum();
      } else {
        setAlbum((java.lang.String)value);
      }
      break;

    case LYRICS:
      if (value == null) {
        unsetLyrics();
      } else {
        setLyrics((java.util.List<java.lang.String>)value);
      }
      break;

    case COMPOSERS:
      if (value == null) {
        unsetComposers();
      } else {
        setComposers((java.util.List<java.lang.String>)value);
      }
      break;

    case KINDS:
      if (value == null) {
        unsetKinds();
      } else {
        setKinds((java.util.List<java.lang.String>)value);
      }
      break;

    case SINGERS:
      if (value == null) {
        unsetSingers();
      } else {
        setSingers((java.util.List<Singer>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case ALBUM:
      return getAlbum();

    case LYRICS:
      return getLyrics();

    case COMPOSERS:
      return getComposers();

    case KINDS:
      return getKinds();

    case SINGERS:
      return getSingers();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case ALBUM:
      return isSetAlbum();
    case LYRICS:
      return isSetLyrics();
    case COMPOSERS:
      return isSetComposers();
    case KINDS:
      return isSetKinds();
    case SINGERS:
      return isSetSingers();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Song)
      return this.equals((Song)that);
    return false;
  }

  public boolean equals(Song that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_album = true && this.isSetAlbum();
    boolean that_present_album = true && that.isSetAlbum();
    if (this_present_album || that_present_album) {
      if (!(this_present_album && that_present_album))
        return false;
      if (!this.album.equals(that.album))
        return false;
    }

    boolean this_present_lyrics = true && this.isSetLyrics();
    boolean that_present_lyrics = true && that.isSetLyrics();
    if (this_present_lyrics || that_present_lyrics) {
      if (!(this_present_lyrics && that_present_lyrics))
        return false;
      if (!this.lyrics.equals(that.lyrics))
        return false;
    }

    boolean this_present_composers = true && this.isSetComposers();
    boolean that_present_composers = true && that.isSetComposers();
    if (this_present_composers || that_present_composers) {
      if (!(this_present_composers && that_present_composers))
        return false;
      if (!this.composers.equals(that.composers))
        return false;
    }

    boolean this_present_kinds = true && this.isSetKinds();
    boolean that_present_kinds = true && that.isSetKinds();
    if (this_present_kinds || that_present_kinds) {
      if (!(this_present_kinds && that_present_kinds))
        return false;
      if (!this.kinds.equals(that.kinds))
        return false;
    }

    boolean this_present_singers = true && this.isSetSingers();
    boolean that_present_singers = true && that.isSetSingers();
    if (this_present_singers || that_present_singers) {
      if (!(this_present_singers && that_present_singers))
        return false;
      if (!this.singers.equals(that.singers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetAlbum()) ? 131071 : 524287);
    if (isSetAlbum())
      hashCode = hashCode * 8191 + album.hashCode();

    hashCode = hashCode * 8191 + ((isSetLyrics()) ? 131071 : 524287);
    if (isSetLyrics())
      hashCode = hashCode * 8191 + lyrics.hashCode();

    hashCode = hashCode * 8191 + ((isSetComposers()) ? 131071 : 524287);
    if (isSetComposers())
      hashCode = hashCode * 8191 + composers.hashCode();

    hashCode = hashCode * 8191 + ((isSetKinds()) ? 131071 : 524287);
    if (isSetKinds())
      hashCode = hashCode * 8191 + kinds.hashCode();

    hashCode = hashCode * 8191 + ((isSetSingers()) ? 131071 : 524287);
    if (isSetSingers())
      hashCode = hashCode * 8191 + singers.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Song other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAlbum()).compareTo(other.isSetAlbum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlbum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.album, other.album);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLyrics()).compareTo(other.isSetLyrics());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLyrics()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lyrics, other.lyrics);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetComposers()).compareTo(other.isSetComposers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComposers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.composers, other.composers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetKinds()).compareTo(other.isSetKinds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKinds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.kinds, other.kinds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSingers()).compareTo(other.isSetSingers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSingers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.singers, other.singers);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Song(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("album:");
    if (this.album == null) {
      sb.append("null");
    } else {
      sb.append(this.album);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lyrics:");
    if (this.lyrics == null) {
      sb.append("null");
    } else {
      sb.append(this.lyrics);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("composers:");
    if (this.composers == null) {
      sb.append("null");
    } else {
      sb.append(this.composers);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("kinds:");
    if (this.kinds == null) {
      sb.append("null");
    } else {
      sb.append(this.kinds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("singers:");
    if (this.singers == null) {
      sb.append("null");
    } else {
      sb.append(this.singers);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SongStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SongStandardScheme getScheme() {
      return new SongStandardScheme();
    }
  }

  private static class SongStandardScheme extends org.apache.thrift.scheme.StandardScheme<Song> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Song struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ALBUM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.album = iprot.readString();
              struct.setAlbumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LYRICS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.lyrics = new java.util.ArrayList<java.lang.String>(_list0.size);
                java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.lyrics.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLyricsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COMPOSERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.composers = new java.util.ArrayList<java.lang.String>(_list3.size);
                java.lang.String _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readString();
                  struct.composers.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setComposersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // KINDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                struct.kinds = new java.util.ArrayList<java.lang.String>(_list6.size);
                java.lang.String _elem7;
                for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                {
                  _elem7 = iprot.readString();
                  struct.kinds.add(_elem7);
                }
                iprot.readListEnd();
              }
              struct.setKindsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SINGERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list9 = iprot.readListBegin();
                struct.singers = new java.util.ArrayList<Singer>(_list9.size);
                Singer _elem10;
                for (int _i11 = 0; _i11 < _list9.size; ++_i11)
                {
                  _elem10 = new Singer();
                  _elem10.read(iprot);
                  struct.singers.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setSingersIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Song struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.album != null) {
        oprot.writeFieldBegin(ALBUM_FIELD_DESC);
        oprot.writeString(struct.album);
        oprot.writeFieldEnd();
      }
      if (struct.lyrics != null) {
        oprot.writeFieldBegin(LYRICS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.lyrics.size()));
          for (java.lang.String _iter12 : struct.lyrics)
          {
            oprot.writeString(_iter12);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.composers != null) {
        oprot.writeFieldBegin(COMPOSERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.composers.size()));
          for (java.lang.String _iter13 : struct.composers)
          {
            oprot.writeString(_iter13);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.kinds != null) {
        oprot.writeFieldBegin(KINDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.kinds.size()));
          for (java.lang.String _iter14 : struct.kinds)
          {
            oprot.writeString(_iter14);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.singers != null) {
        oprot.writeFieldBegin(SINGERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.singers.size()));
          for (Singer _iter15 : struct.singers)
          {
            _iter15.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SongTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SongTupleScheme getScheme() {
      return new SongTupleScheme();
    }
  }

  private static class SongTupleScheme extends org.apache.thrift.scheme.TupleScheme<Song> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Song struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetAlbum()) {
        optionals.set(2);
      }
      if (struct.isSetLyrics()) {
        optionals.set(3);
      }
      if (struct.isSetComposers()) {
        optionals.set(4);
      }
      if (struct.isSetKinds()) {
        optionals.set(5);
      }
      if (struct.isSetSingers()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetAlbum()) {
        oprot.writeString(struct.album);
      }
      if (struct.isSetLyrics()) {
        {
          oprot.writeI32(struct.lyrics.size());
          for (java.lang.String _iter16 : struct.lyrics)
          {
            oprot.writeString(_iter16);
          }
        }
      }
      if (struct.isSetComposers()) {
        {
          oprot.writeI32(struct.composers.size());
          for (java.lang.String _iter17 : struct.composers)
          {
            oprot.writeString(_iter17);
          }
        }
      }
      if (struct.isSetKinds()) {
        {
          oprot.writeI32(struct.kinds.size());
          for (java.lang.String _iter18 : struct.kinds)
          {
            oprot.writeString(_iter18);
          }
        }
      }
      if (struct.isSetSingers()) {
        {
          oprot.writeI32(struct.singers.size());
          for (Singer _iter19 : struct.singers)
          {
            _iter19.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Song struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.album = iprot.readString();
        struct.setAlbumIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list20 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.lyrics = new java.util.ArrayList<java.lang.String>(_list20.size);
          java.lang.String _elem21;
          for (int _i22 = 0; _i22 < _list20.size; ++_i22)
          {
            _elem21 = iprot.readString();
            struct.lyrics.add(_elem21);
          }
        }
        struct.setLyricsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.composers = new java.util.ArrayList<java.lang.String>(_list23.size);
          java.lang.String _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = iprot.readString();
            struct.composers.add(_elem24);
          }
        }
        struct.setComposersIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.kinds = new java.util.ArrayList<java.lang.String>(_list26.size);
          java.lang.String _elem27;
          for (int _i28 = 0; _i28 < _list26.size; ++_i28)
          {
            _elem27 = iprot.readString();
            struct.kinds.add(_elem27);
          }
        }
        struct.setKindsIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.singers = new java.util.ArrayList<Singer>(_list29.size);
          Singer _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = new Singer();
            _elem30.read(iprot);
            struct.singers.add(_elem30);
          }
        }
        struct.setSingersIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

