// ORM class for table 'tcfg_ca_configuracionposicion'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 30 21:15:58 UTC 2017
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

public class tcfg_ca_configuracionposicion extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer tcfgcaconfid;
  public Integer get_tcfgcaconfid() {
    return tcfgcaconfid;
  }
  public void set_tcfgcaconfid(Integer tcfgcaconfid) {
    this.tcfgcaconfid = tcfgcaconfid;
  }
  public tcfg_ca_configuracionposicion with_tcfgcaconfid(Integer tcfgcaconfid) {
    this.tcfgcaconfid = tcfgcaconfid;
    return this;
  }
  private Integer tcfgcaconposicionid;
  public Integer get_tcfgcaconposicionid() {
    return tcfgcaconposicionid;
  }
  public void set_tcfgcaconposicionid(Integer tcfgcaconposicionid) {
    this.tcfgcaconposicionid = tcfgcaconposicionid;
  }
  public tcfg_ca_configuracionposicion with_tcfgcaconposicionid(Integer tcfgcaconposicionid) {
    this.tcfgcaconposicionid = tcfgcaconposicionid;
    return this;
  }
  private java.math.BigDecimal tcfgcaconposicionlatitud;
  public java.math.BigDecimal get_tcfgcaconposicionlatitud() {
    return tcfgcaconposicionlatitud;
  }
  public void set_tcfgcaconposicionlatitud(java.math.BigDecimal tcfgcaconposicionlatitud) {
    this.tcfgcaconposicionlatitud = tcfgcaconposicionlatitud;
  }
  public tcfg_ca_configuracionposicion with_tcfgcaconposicionlatitud(java.math.BigDecimal tcfgcaconposicionlatitud) {
    this.tcfgcaconposicionlatitud = tcfgcaconposicionlatitud;
    return this;
  }
  private java.math.BigDecimal tcfgcaconposicionlongitud;
  public java.math.BigDecimal get_tcfgcaconposicionlongitud() {
    return tcfgcaconposicionlongitud;
  }
  public void set_tcfgcaconposicionlongitud(java.math.BigDecimal tcfgcaconposicionlongitud) {
    this.tcfgcaconposicionlongitud = tcfgcaconposicionlongitud;
  }
  public tcfg_ca_configuracionposicion with_tcfgcaconposicionlongitud(java.math.BigDecimal tcfgcaconposicionlongitud) {
    this.tcfgcaconposicionlongitud = tcfgcaconposicionlongitud;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tcfg_ca_configuracionposicion)) {
      return false;
    }
    tcfg_ca_configuracionposicion that = (tcfg_ca_configuracionposicion) o;
    boolean equal = true;
    equal = equal && (this.tcfgcaconfid == null ? that.tcfgcaconfid == null : this.tcfgcaconfid.equals(that.tcfgcaconfid));
    equal = equal && (this.tcfgcaconposicionid == null ? that.tcfgcaconposicionid == null : this.tcfgcaconposicionid.equals(that.tcfgcaconposicionid));
    equal = equal && (this.tcfgcaconposicionlatitud == null ? that.tcfgcaconposicionlatitud == null : this.tcfgcaconposicionlatitud.equals(that.tcfgcaconposicionlatitud));
    equal = equal && (this.tcfgcaconposicionlongitud == null ? that.tcfgcaconposicionlongitud == null : this.tcfgcaconposicionlongitud.equals(that.tcfgcaconposicionlongitud));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tcfg_ca_configuracionposicion)) {
      return false;
    }
    tcfg_ca_configuracionposicion that = (tcfg_ca_configuracionposicion) o;
    boolean equal = true;
    equal = equal && (this.tcfgcaconfid == null ? that.tcfgcaconfid == null : this.tcfgcaconfid.equals(that.tcfgcaconfid));
    equal = equal && (this.tcfgcaconposicionid == null ? that.tcfgcaconposicionid == null : this.tcfgcaconposicionid.equals(that.tcfgcaconposicionid));
    equal = equal && (this.tcfgcaconposicionlatitud == null ? that.tcfgcaconposicionlatitud == null : this.tcfgcaconposicionlatitud.equals(that.tcfgcaconposicionlatitud));
    equal = equal && (this.tcfgcaconposicionlongitud == null ? that.tcfgcaconposicionlongitud == null : this.tcfgcaconposicionlongitud.equals(that.tcfgcaconposicionlongitud));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.tcfgcaconfid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.tcfgcaconposicionid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.tcfgcaconposicionlatitud = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.tcfgcaconposicionlongitud = JdbcWritableBridge.readBigDecimal(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.tcfgcaconfid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.tcfgcaconposicionid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.tcfgcaconposicionlatitud = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.tcfgcaconposicionlongitud = JdbcWritableBridge.readBigDecimal(4, __dbResults);
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
    JdbcWritableBridge.writeInteger(tcfgcaconfid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tcfgcaconposicionid, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tcfgcaconposicionlatitud, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tcfgcaconposicionlongitud, 4 + __off, 2, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(tcfgcaconfid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tcfgcaconposicionid, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tcfgcaconposicionlatitud, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tcfgcaconposicionlongitud, 4 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.tcfgcaconfid = null;
    } else {
    this.tcfgcaconfid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tcfgcaconposicionid = null;
    } else {
    this.tcfgcaconposicionid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tcfgcaconposicionlatitud = null;
    } else {
    this.tcfgcaconposicionlatitud = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tcfgcaconposicionlongitud = null;
    } else {
    this.tcfgcaconposicionlongitud = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.tcfgcaconfid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tcfgcaconfid);
    }
    if (null == this.tcfgcaconposicionid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tcfgcaconposicionid);
    }
    if (null == this.tcfgcaconposicionlatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tcfgcaconposicionlatitud, __dataOut);
    }
    if (null == this.tcfgcaconposicionlongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tcfgcaconposicionlongitud, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.tcfgcaconfid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tcfgcaconfid);
    }
    if (null == this.tcfgcaconposicionid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tcfgcaconposicionid);
    }
    if (null == this.tcfgcaconposicionlatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tcfgcaconposicionlatitud, __dataOut);
    }
    if (null == this.tcfgcaconposicionlongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tcfgcaconposicionlongitud, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(tcfgcaconfid==null?"null":"" + tcfgcaconfid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tcfgcaconposicionid==null?"null":"" + tcfgcaconposicionid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tcfgcaconposicionlatitud==null?"null":tcfgcaconposicionlatitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tcfgcaconposicionlongitud==null?"null":tcfgcaconposicionlongitud.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(tcfgcaconfid==null?"null":"" + tcfgcaconfid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tcfgcaconposicionid==null?"null":"" + tcfgcaconposicionid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tcfgcaconposicionlatitud==null?"null":tcfgcaconposicionlatitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tcfgcaconposicionlongitud==null?"null":tcfgcaconposicionlongitud.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tcfgcaconfid = null; } else {
      this.tcfgcaconfid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tcfgcaconposicionid = null; } else {
      this.tcfgcaconposicionid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tcfgcaconposicionlatitud = null; } else {
      this.tcfgcaconposicionlatitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tcfgcaconposicionlongitud = null; } else {
      this.tcfgcaconposicionlongitud = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tcfgcaconfid = null; } else {
      this.tcfgcaconfid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tcfgcaconposicionid = null; } else {
      this.tcfgcaconposicionid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tcfgcaconposicionlatitud = null; } else {
      this.tcfgcaconposicionlatitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tcfgcaconposicionlongitud = null; } else {
      this.tcfgcaconposicionlongitud = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tcfg_ca_configuracionposicion o = (tcfg_ca_configuracionposicion) super.clone();
    return o;
  }

  public void clone0(tcfg_ca_configuracionposicion o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("tcfgcaconfid", this.tcfgcaconfid);
    __sqoop$field_map.put("tcfgcaconposicionid", this.tcfgcaconposicionid);
    __sqoop$field_map.put("tcfgcaconposicionlatitud", this.tcfgcaconposicionlatitud);
    __sqoop$field_map.put("tcfgcaconposicionlongitud", this.tcfgcaconposicionlongitud);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("tcfgcaconfid", this.tcfgcaconfid);
    __sqoop$field_map.put("tcfgcaconposicionid", this.tcfgcaconposicionid);
    __sqoop$field_map.put("tcfgcaconposicionlatitud", this.tcfgcaconposicionlatitud);
    __sqoop$field_map.put("tcfgcaconposicionlongitud", this.tcfgcaconposicionlongitud);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("tcfgcaconfid".equals(__fieldName)) {
      this.tcfgcaconfid = (Integer) __fieldVal;
    }
    else    if ("tcfgcaconposicionid".equals(__fieldName)) {
      this.tcfgcaconposicionid = (Integer) __fieldVal;
    }
    else    if ("tcfgcaconposicionlatitud".equals(__fieldName)) {
      this.tcfgcaconposicionlatitud = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tcfgcaconposicionlongitud".equals(__fieldName)) {
      this.tcfgcaconposicionlongitud = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("tcfgcaconfid".equals(__fieldName)) {
      this.tcfgcaconfid = (Integer) __fieldVal;
      return true;
    }
    else    if ("tcfgcaconposicionid".equals(__fieldName)) {
      this.tcfgcaconposicionid = (Integer) __fieldVal;
      return true;
    }
    else    if ("tcfgcaconposicionlatitud".equals(__fieldName)) {
      this.tcfgcaconposicionlatitud = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("tcfgcaconposicionlongitud".equals(__fieldName)) {
      this.tcfgcaconposicionlongitud = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
