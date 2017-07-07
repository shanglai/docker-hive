// ORM class for table 'patronfaqueryposicion'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 30 21:05:59 UTC 2017
// For connector: org.apache.sqoop.manager.DirectPostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class patronfaqueryposicion extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long patronfaqid;
  public Long get_patronfaqid() {
    return patronfaqid;
  }
  public void set_patronfaqid(Long patronfaqid) {
    this.patronfaqid = patronfaqid;
  }
  public patronfaqueryposicion with_patronfaqid(Long patronfaqid) {
    this.patronfaqid = patronfaqid;
    return this;
  }
  private Integer posicionid;
  public Integer get_posicionid() {
    return posicionid;
  }
  public void set_posicionid(Integer posicionid) {
    this.posicionid = posicionid;
  }
  public patronfaqueryposicion with_posicionid(Integer posicionid) {
    this.posicionid = posicionid;
    return this;
  }
  private java.math.BigDecimal posicionlatitud;
  public java.math.BigDecimal get_posicionlatitud() {
    return posicionlatitud;
  }
  public void set_posicionlatitud(java.math.BigDecimal posicionlatitud) {
    this.posicionlatitud = posicionlatitud;
  }
  public patronfaqueryposicion with_posicionlatitud(java.math.BigDecimal posicionlatitud) {
    this.posicionlatitud = posicionlatitud;
    return this;
  }
  private java.math.BigDecimal posicionlongitud;
  public java.math.BigDecimal get_posicionlongitud() {
    return posicionlongitud;
  }
  public void set_posicionlongitud(java.math.BigDecimal posicionlongitud) {
    this.posicionlongitud = posicionlongitud;
  }
  public patronfaqueryposicion with_posicionlongitud(java.math.BigDecimal posicionlongitud) {
    this.posicionlongitud = posicionlongitud;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof patronfaqueryposicion)) {
      return false;
    }
    patronfaqueryposicion that = (patronfaqueryposicion) o;
    boolean equal = true;
    equal = equal && (this.patronfaqid == null ? that.patronfaqid == null : this.patronfaqid.equals(that.patronfaqid));
    equal = equal && (this.posicionid == null ? that.posicionid == null : this.posicionid.equals(that.posicionid));
    equal = equal && (this.posicionlatitud == null ? that.posicionlatitud == null : this.posicionlatitud.equals(that.posicionlatitud));
    equal = equal && (this.posicionlongitud == null ? that.posicionlongitud == null : this.posicionlongitud.equals(that.posicionlongitud));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof patronfaqueryposicion)) {
      return false;
    }
    patronfaqueryposicion that = (patronfaqueryposicion) o;
    boolean equal = true;
    equal = equal && (this.patronfaqid == null ? that.patronfaqid == null : this.patronfaqid.equals(that.patronfaqid));
    equal = equal && (this.posicionid == null ? that.posicionid == null : this.posicionid.equals(that.posicionid));
    equal = equal && (this.posicionlatitud == null ? that.posicionlatitud == null : this.posicionlatitud.equals(that.posicionlatitud));
    equal = equal && (this.posicionlongitud == null ? that.posicionlongitud == null : this.posicionlongitud.equals(that.posicionlongitud));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.patronfaqid = JdbcWritableBridge.readLong(1, __dbResults);
    this.posicionid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.posicionlatitud = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.posicionlongitud = JdbcWritableBridge.readBigDecimal(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.patronfaqid = JdbcWritableBridge.readLong(1, __dbResults);
    this.posicionid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.posicionlatitud = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.posicionlongitud = JdbcWritableBridge.readBigDecimal(4, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(patronfaqid, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(posicionid, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(posicionlatitud, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(posicionlongitud, 4 + __off, 2, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(patronfaqid, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(posicionid, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(posicionlatitud, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(posicionlongitud, 4 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.patronfaqid = null;
    } else {
    this.patronfaqid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.posicionid = null;
    } else {
    this.posicionid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.posicionlatitud = null;
    } else {
    this.posicionlatitud = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.posicionlongitud = null;
    } else {
    this.posicionlongitud = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.patronfaqid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.patronfaqid);
    }
    if (null == this.posicionid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.posicionid);
    }
    if (null == this.posicionlatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.posicionlatitud, __dataOut);
    }
    if (null == this.posicionlongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.posicionlongitud, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.patronfaqid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.patronfaqid);
    }
    if (null == this.posicionid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.posicionid);
    }
    if (null == this.posicionlatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.posicionlatitud, __dataOut);
    }
    if (null == this.posicionlongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.posicionlongitud, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(patronfaqid==null?"null":"" + patronfaqid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(posicionid==null?"null":"" + posicionid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(posicionlatitud==null?"null":posicionlatitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(posicionlongitud==null?"null":posicionlongitud.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(patronfaqid==null?"null":"" + patronfaqid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(posicionid==null?"null":"" + posicionid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(posicionlatitud==null?"null":posicionlatitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(posicionlongitud==null?"null":posicionlongitud.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.patronfaqid = null; } else {
      this.patronfaqid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.posicionid = null; } else {
      this.posicionid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.posicionlatitud = null; } else {
      this.posicionlatitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.posicionlongitud = null; } else {
      this.posicionlongitud = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.patronfaqid = null; } else {
      this.patronfaqid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.posicionid = null; } else {
      this.posicionid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.posicionlatitud = null; } else {
      this.posicionlatitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.posicionlongitud = null; } else {
      this.posicionlongitud = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    patronfaqueryposicion o = (patronfaqueryposicion) super.clone();
    return o;
  }

  public void clone0(patronfaqueryposicion o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("patronfaqid", this.patronfaqid);
    __sqoop$field_map.put("posicionid", this.posicionid);
    __sqoop$field_map.put("posicionlatitud", this.posicionlatitud);
    __sqoop$field_map.put("posicionlongitud", this.posicionlongitud);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("patronfaqid", this.patronfaqid);
    __sqoop$field_map.put("posicionid", this.posicionid);
    __sqoop$field_map.put("posicionlatitud", this.posicionlatitud);
    __sqoop$field_map.put("posicionlongitud", this.posicionlongitud);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("patronfaqid".equals(__fieldName)) {
      this.patronfaqid = (Long) __fieldVal;
    }
    else    if ("posicionid".equals(__fieldName)) {
      this.posicionid = (Integer) __fieldVal;
    }
    else    if ("posicionlatitud".equals(__fieldName)) {
      this.posicionlatitud = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("posicionlongitud".equals(__fieldName)) {
      this.posicionlongitud = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("patronfaqid".equals(__fieldName)) {
      this.patronfaqid = (Long) __fieldVal;
      return true;
    }
    else    if ("posicionid".equals(__fieldName)) {
      this.posicionid = (Integer) __fieldVal;
      return true;
    }
    else    if ("posicionlatitud".equals(__fieldName)) {
      this.posicionlatitud = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("posicionlongitud".equals(__fieldName)) {
      this.posicionlongitud = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
