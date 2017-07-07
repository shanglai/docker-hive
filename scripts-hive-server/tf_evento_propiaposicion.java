// ORM class for table 'tf_evento_propiaposicion'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 30 21:16:45 UTC 2017
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

public class tf_evento_propiaposicion extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long tfevtcorrsistfte;
  public Long get_tfevtcorrsistfte() {
    return tfevtcorrsistfte;
  }
  public void set_tfevtcorrsistfte(Long tfevtcorrsistfte) {
    this.tfevtcorrsistfte = tfevtcorrsistfte;
  }
  public tf_evento_propiaposicion with_tfevtcorrsistfte(Long tfevtcorrsistfte) {
    this.tfevtcorrsistfte = tfevtcorrsistfte;
    return this;
  }
  private Integer tfevtpropiaid;
  public Integer get_tfevtpropiaid() {
    return tfevtpropiaid;
  }
  public void set_tfevtpropiaid(Integer tfevtpropiaid) {
    this.tfevtpropiaid = tfevtpropiaid;
  }
  public tf_evento_propiaposicion with_tfevtpropiaid(Integer tfevtpropiaid) {
    this.tfevtpropiaid = tfevtpropiaid;
    return this;
  }
  private Integer tfevtpropiaposiid;
  public Integer get_tfevtpropiaposiid() {
    return tfevtpropiaposiid;
  }
  public void set_tfevtpropiaposiid(Integer tfevtpropiaposiid) {
    this.tfevtpropiaposiid = tfevtpropiaposiid;
  }
  public tf_evento_propiaposicion with_tfevtpropiaposiid(Integer tfevtpropiaposiid) {
    this.tfevtpropiaposiid = tfevtpropiaposiid;
    return this;
  }
  private Long tfevtpropiaposiidmaster;
  public Long get_tfevtpropiaposiidmaster() {
    return tfevtpropiaposiidmaster;
  }
  public void set_tfevtpropiaposiidmaster(Long tfevtpropiaposiidmaster) {
    this.tfevtpropiaposiidmaster = tfevtpropiaposiidmaster;
  }
  public tf_evento_propiaposicion with_tfevtpropiaposiidmaster(Long tfevtpropiaposiidmaster) {
    this.tfevtpropiaposiidmaster = tfevtpropiaposiidmaster;
    return this;
  }
  private Long tfevtpropiaposiidfte;
  public Long get_tfevtpropiaposiidfte() {
    return tfevtpropiaposiidfte;
  }
  public void set_tfevtpropiaposiidfte(Long tfevtpropiaposiidfte) {
    this.tfevtpropiaposiidfte = tfevtpropiaposiidfte;
  }
  public tf_evento_propiaposicion with_tfevtpropiaposiidfte(Long tfevtpropiaposiidfte) {
    this.tfevtpropiaposiidfte = tfevtpropiaposiidfte;
    return this;
  }
  private Boolean tfevtpropiaposicuenta;
  public Boolean get_tfevtpropiaposicuenta() {
    return tfevtpropiaposicuenta;
  }
  public void set_tfevtpropiaposicuenta(Boolean tfevtpropiaposicuenta) {
    this.tfevtpropiaposicuenta = tfevtpropiaposicuenta;
  }
  public tf_evento_propiaposicion with_tfevtpropiaposicuenta(Boolean tfevtpropiaposicuenta) {
    this.tfevtpropiaposicuenta = tfevtpropiaposicuenta;
    return this;
  }
  private java.sql.Timestamp tfevtpropiaposifecha;
  public java.sql.Timestamp get_tfevtpropiaposifecha() {
    return tfevtpropiaposifecha;
  }
  public void set_tfevtpropiaposifecha(java.sql.Timestamp tfevtpropiaposifecha) {
    this.tfevtpropiaposifecha = tfevtpropiaposifecha;
  }
  public tf_evento_propiaposicion with_tfevtpropiaposifecha(java.sql.Timestamp tfevtpropiaposifecha) {
    this.tfevtpropiaposifecha = tfevtpropiaposifecha;
    return this;
  }
  private java.math.BigDecimal tfevtpropiaposilatitud;
  public java.math.BigDecimal get_tfevtpropiaposilatitud() {
    return tfevtpropiaposilatitud;
  }
  public void set_tfevtpropiaposilatitud(java.math.BigDecimal tfevtpropiaposilatitud) {
    this.tfevtpropiaposilatitud = tfevtpropiaposilatitud;
  }
  public tf_evento_propiaposicion with_tfevtpropiaposilatitud(java.math.BigDecimal tfevtpropiaposilatitud) {
    this.tfevtpropiaposilatitud = tfevtpropiaposilatitud;
    return this;
  }
  private java.math.BigDecimal tfevtpropiaposilongitud;
  public java.math.BigDecimal get_tfevtpropiaposilongitud() {
    return tfevtpropiaposilongitud;
  }
  public void set_tfevtpropiaposilongitud(java.math.BigDecimal tfevtpropiaposilongitud) {
    this.tfevtpropiaposilongitud = tfevtpropiaposilongitud;
  }
  public tf_evento_propiaposicion with_tfevtpropiaposilongitud(java.math.BigDecimal tfevtpropiaposilongitud) {
    this.tfevtpropiaposilongitud = tfevtpropiaposilongitud;
    return this;
  }
  private java.math.BigDecimal tfevtpropiaposivelocidad;
  public java.math.BigDecimal get_tfevtpropiaposivelocidad() {
    return tfevtpropiaposivelocidad;
  }
  public void set_tfevtpropiaposivelocidad(java.math.BigDecimal tfevtpropiaposivelocidad) {
    this.tfevtpropiaposivelocidad = tfevtpropiaposivelocidad;
  }
  public tf_evento_propiaposicion with_tfevtpropiaposivelocidad(java.math.BigDecimal tfevtpropiaposivelocidad) {
    this.tfevtpropiaposivelocidad = tfevtpropiaposivelocidad;
    return this;
  }
  private java.math.BigDecimal tfevtpropiaposirumbo;
  public java.math.BigDecimal get_tfevtpropiaposirumbo() {
    return tfevtpropiaposirumbo;
  }
  public void set_tfevtpropiaposirumbo(java.math.BigDecimal tfevtpropiaposirumbo) {
    this.tfevtpropiaposirumbo = tfevtpropiaposirumbo;
  }
  public tf_evento_propiaposicion with_tfevtpropiaposirumbo(java.math.BigDecimal tfevtpropiaposirumbo) {
    this.tfevtpropiaposirumbo = tfevtpropiaposirumbo;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tf_evento_propiaposicion)) {
      return false;
    }
    tf_evento_propiaposicion that = (tf_evento_propiaposicion) o;
    boolean equal = true;
    equal = equal && (this.tfevtcorrsistfte == null ? that.tfevtcorrsistfte == null : this.tfevtcorrsistfte.equals(that.tfevtcorrsistfte));
    equal = equal && (this.tfevtpropiaid == null ? that.tfevtpropiaid == null : this.tfevtpropiaid.equals(that.tfevtpropiaid));
    equal = equal && (this.tfevtpropiaposiid == null ? that.tfevtpropiaposiid == null : this.tfevtpropiaposiid.equals(that.tfevtpropiaposiid));
    equal = equal && (this.tfevtpropiaposiidmaster == null ? that.tfevtpropiaposiidmaster == null : this.tfevtpropiaposiidmaster.equals(that.tfevtpropiaposiidmaster));
    equal = equal && (this.tfevtpropiaposiidfte == null ? that.tfevtpropiaposiidfte == null : this.tfevtpropiaposiidfte.equals(that.tfevtpropiaposiidfte));
    equal = equal && (this.tfevtpropiaposicuenta == null ? that.tfevtpropiaposicuenta == null : this.tfevtpropiaposicuenta.equals(that.tfevtpropiaposicuenta));
    equal = equal && (this.tfevtpropiaposifecha == null ? that.tfevtpropiaposifecha == null : this.tfevtpropiaposifecha.equals(that.tfevtpropiaposifecha));
    equal = equal && (this.tfevtpropiaposilatitud == null ? that.tfevtpropiaposilatitud == null : this.tfevtpropiaposilatitud.equals(that.tfevtpropiaposilatitud));
    equal = equal && (this.tfevtpropiaposilongitud == null ? that.tfevtpropiaposilongitud == null : this.tfevtpropiaposilongitud.equals(that.tfevtpropiaposilongitud));
    equal = equal && (this.tfevtpropiaposivelocidad == null ? that.tfevtpropiaposivelocidad == null : this.tfevtpropiaposivelocidad.equals(that.tfevtpropiaposivelocidad));
    equal = equal && (this.tfevtpropiaposirumbo == null ? that.tfevtpropiaposirumbo == null : this.tfevtpropiaposirumbo.equals(that.tfevtpropiaposirumbo));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tf_evento_propiaposicion)) {
      return false;
    }
    tf_evento_propiaposicion that = (tf_evento_propiaposicion) o;
    boolean equal = true;
    equal = equal && (this.tfevtcorrsistfte == null ? that.tfevtcorrsistfte == null : this.tfevtcorrsistfte.equals(that.tfevtcorrsistfte));
    equal = equal && (this.tfevtpropiaid == null ? that.tfevtpropiaid == null : this.tfevtpropiaid.equals(that.tfevtpropiaid));
    equal = equal && (this.tfevtpropiaposiid == null ? that.tfevtpropiaposiid == null : this.tfevtpropiaposiid.equals(that.tfevtpropiaposiid));
    equal = equal && (this.tfevtpropiaposiidmaster == null ? that.tfevtpropiaposiidmaster == null : this.tfevtpropiaposiidmaster.equals(that.tfevtpropiaposiidmaster));
    equal = equal && (this.tfevtpropiaposiidfte == null ? that.tfevtpropiaposiidfte == null : this.tfevtpropiaposiidfte.equals(that.tfevtpropiaposiidfte));
    equal = equal && (this.tfevtpropiaposicuenta == null ? that.tfevtpropiaposicuenta == null : this.tfevtpropiaposicuenta.equals(that.tfevtpropiaposicuenta));
    equal = equal && (this.tfevtpropiaposifecha == null ? that.tfevtpropiaposifecha == null : this.tfevtpropiaposifecha.equals(that.tfevtpropiaposifecha));
    equal = equal && (this.tfevtpropiaposilatitud == null ? that.tfevtpropiaposilatitud == null : this.tfevtpropiaposilatitud.equals(that.tfevtpropiaposilatitud));
    equal = equal && (this.tfevtpropiaposilongitud == null ? that.tfevtpropiaposilongitud == null : this.tfevtpropiaposilongitud.equals(that.tfevtpropiaposilongitud));
    equal = equal && (this.tfevtpropiaposivelocidad == null ? that.tfevtpropiaposivelocidad == null : this.tfevtpropiaposivelocidad.equals(that.tfevtpropiaposivelocidad));
    equal = equal && (this.tfevtpropiaposirumbo == null ? that.tfevtpropiaposirumbo == null : this.tfevtpropiaposirumbo.equals(that.tfevtpropiaposirumbo));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.tfevtcorrsistfte = JdbcWritableBridge.readLong(1, __dbResults);
    this.tfevtpropiaid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.tfevtpropiaposiid = JdbcWritableBridge.readInteger(3, __dbResults);
    this.tfevtpropiaposiidmaster = JdbcWritableBridge.readLong(4, __dbResults);
    this.tfevtpropiaposiidfte = JdbcWritableBridge.readLong(5, __dbResults);
    this.tfevtpropiaposicuenta = JdbcWritableBridge.readBoolean(6, __dbResults);
    this.tfevtpropiaposifecha = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.tfevtpropiaposilatitud = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.tfevtpropiaposilongitud = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.tfevtpropiaposivelocidad = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.tfevtpropiaposirumbo = JdbcWritableBridge.readBigDecimal(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.tfevtcorrsistfte = JdbcWritableBridge.readLong(1, __dbResults);
    this.tfevtpropiaid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.tfevtpropiaposiid = JdbcWritableBridge.readInteger(3, __dbResults);
    this.tfevtpropiaposiidmaster = JdbcWritableBridge.readLong(4, __dbResults);
    this.tfevtpropiaposiidfte = JdbcWritableBridge.readLong(5, __dbResults);
    this.tfevtpropiaposicuenta = JdbcWritableBridge.readBoolean(6, __dbResults);
    this.tfevtpropiaposifecha = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.tfevtpropiaposilatitud = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.tfevtpropiaposilongitud = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.tfevtpropiaposivelocidad = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.tfevtpropiaposirumbo = JdbcWritableBridge.readBigDecimal(11, __dbResults);
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
    JdbcWritableBridge.writeLong(tfevtcorrsistfte, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(tfevtpropiaid, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(tfevtpropiaposiid, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(tfevtpropiaposiidmaster, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(tfevtpropiaposiidfte, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBoolean(tfevtpropiaposicuenta, 6 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tfevtpropiaposifecha, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtpropiaposilatitud, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtpropiaposilongitud, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtpropiaposivelocidad, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtpropiaposirumbo, 11 + __off, 2, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(tfevtcorrsistfte, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(tfevtpropiaid, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(tfevtpropiaposiid, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(tfevtpropiaposiidmaster, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(tfevtpropiaposiidfte, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBoolean(tfevtpropiaposicuenta, 6 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tfevtpropiaposifecha, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtpropiaposilatitud, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtpropiaposilongitud, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtpropiaposivelocidad, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtpropiaposirumbo, 11 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.tfevtcorrsistfte = null;
    } else {
    this.tfevtcorrsistfte = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaid = null;
    } else {
    this.tfevtpropiaid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaposiid = null;
    } else {
    this.tfevtpropiaposiid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaposiidmaster = null;
    } else {
    this.tfevtpropiaposiidmaster = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaposiidfte = null;
    } else {
    this.tfevtpropiaposiidfte = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaposicuenta = null;
    } else {
    this.tfevtpropiaposicuenta = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaposifecha = null;
    } else {
    this.tfevtpropiaposifecha = new Timestamp(__dataIn.readLong());
    this.tfevtpropiaposifecha.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaposilatitud = null;
    } else {
    this.tfevtpropiaposilatitud = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaposilongitud = null;
    } else {
    this.tfevtpropiaposilongitud = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaposivelocidad = null;
    } else {
    this.tfevtpropiaposivelocidad = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtpropiaposirumbo = null;
    } else {
    this.tfevtpropiaposirumbo = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.tfevtcorrsistfte) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtcorrsistfte);
    }
    if (null == this.tfevtpropiaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtpropiaid);
    }
    if (null == this.tfevtpropiaposiid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtpropiaposiid);
    }
    if (null == this.tfevtpropiaposiidmaster) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtpropiaposiidmaster);
    }
    if (null == this.tfevtpropiaposiidfte) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtpropiaposiidfte);
    }
    if (null == this.tfevtpropiaposicuenta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.tfevtpropiaposicuenta);
    }
    if (null == this.tfevtpropiaposifecha) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtpropiaposifecha.getTime());
    __dataOut.writeInt(this.tfevtpropiaposifecha.getNanos());
    }
    if (null == this.tfevtpropiaposilatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtpropiaposilatitud, __dataOut);
    }
    if (null == this.tfevtpropiaposilongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtpropiaposilongitud, __dataOut);
    }
    if (null == this.tfevtpropiaposivelocidad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtpropiaposivelocidad, __dataOut);
    }
    if (null == this.tfevtpropiaposirumbo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtpropiaposirumbo, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.tfevtcorrsistfte) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtcorrsistfte);
    }
    if (null == this.tfevtpropiaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtpropiaid);
    }
    if (null == this.tfevtpropiaposiid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtpropiaposiid);
    }
    if (null == this.tfevtpropiaposiidmaster) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtpropiaposiidmaster);
    }
    if (null == this.tfevtpropiaposiidfte) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtpropiaposiidfte);
    }
    if (null == this.tfevtpropiaposicuenta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.tfevtpropiaposicuenta);
    }
    if (null == this.tfevtpropiaposifecha) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtpropiaposifecha.getTime());
    __dataOut.writeInt(this.tfevtpropiaposifecha.getNanos());
    }
    if (null == this.tfevtpropiaposilatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtpropiaposilatitud, __dataOut);
    }
    if (null == this.tfevtpropiaposilongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtpropiaposilongitud, __dataOut);
    }
    if (null == this.tfevtpropiaposivelocidad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtpropiaposivelocidad, __dataOut);
    }
    if (null == this.tfevtpropiaposirumbo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtpropiaposirumbo, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtcorrsistfte==null?"null":"" + tfevtcorrsistfte, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaid==null?"null":"" + tfevtpropiaid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposiid==null?"null":"" + tfevtpropiaposiid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposiidmaster==null?"null":"" + tfevtpropiaposiidmaster, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposiidfte==null?"null":"" + tfevtpropiaposiidfte, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposicuenta==null?"null":"" + tfevtpropiaposicuenta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposifecha==null?"null":"" + tfevtpropiaposifecha, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposilatitud==null?"null":tfevtpropiaposilatitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposilongitud==null?"null":tfevtpropiaposilongitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposivelocidad==null?"null":tfevtpropiaposivelocidad.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposirumbo==null?"null":tfevtpropiaposirumbo.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtcorrsistfte==null?"null":"" + tfevtcorrsistfte, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaid==null?"null":"" + tfevtpropiaid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposiid==null?"null":"" + tfevtpropiaposiid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposiidmaster==null?"null":"" + tfevtpropiaposiidmaster, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposiidfte==null?"null":"" + tfevtpropiaposiidfte, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposicuenta==null?"null":"" + tfevtpropiaposicuenta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposifecha==null?"null":"" + tfevtpropiaposifecha, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposilatitud==null?"null":tfevtpropiaposilatitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposilongitud==null?"null":tfevtpropiaposilongitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposivelocidad==null?"null":tfevtpropiaposivelocidad.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtpropiaposirumbo==null?"null":tfevtpropiaposirumbo.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtcorrsistfte = null; } else {
      this.tfevtcorrsistfte = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaid = null; } else {
      this.tfevtpropiaid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposiid = null; } else {
      this.tfevtpropiaposiid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposiidmaster = null; } else {
      this.tfevtpropiaposiidmaster = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposiidfte = null; } else {
      this.tfevtpropiaposiidfte = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposicuenta = null; } else {
      this.tfevtpropiaposicuenta = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposifecha = null; } else {
      this.tfevtpropiaposifecha = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposilatitud = null; } else {
      this.tfevtpropiaposilatitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposilongitud = null; } else {
      this.tfevtpropiaposilongitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposivelocidad = null; } else {
      this.tfevtpropiaposivelocidad = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposirumbo = null; } else {
      this.tfevtpropiaposirumbo = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtcorrsistfte = null; } else {
      this.tfevtcorrsistfte = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaid = null; } else {
      this.tfevtpropiaid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposiid = null; } else {
      this.tfevtpropiaposiid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposiidmaster = null; } else {
      this.tfevtpropiaposiidmaster = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposiidfte = null; } else {
      this.tfevtpropiaposiidfte = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposicuenta = null; } else {
      this.tfevtpropiaposicuenta = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposifecha = null; } else {
      this.tfevtpropiaposifecha = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposilatitud = null; } else {
      this.tfevtpropiaposilatitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposilongitud = null; } else {
      this.tfevtpropiaposilongitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposivelocidad = null; } else {
      this.tfevtpropiaposivelocidad = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtpropiaposirumbo = null; } else {
      this.tfevtpropiaposirumbo = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tf_evento_propiaposicion o = (tf_evento_propiaposicion) super.clone();
    o.tfevtpropiaposifecha = (o.tfevtpropiaposifecha != null) ? (java.sql.Timestamp) o.tfevtpropiaposifecha.clone() : null;
    return o;
  }

  public void clone0(tf_evento_propiaposicion o) throws CloneNotSupportedException {
    o.tfevtpropiaposifecha = (o.tfevtpropiaposifecha != null) ? (java.sql.Timestamp) o.tfevtpropiaposifecha.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("tfevtcorrsistfte", this.tfevtcorrsistfte);
    __sqoop$field_map.put("tfevtpropiaid", this.tfevtpropiaid);
    __sqoop$field_map.put("tfevtpropiaposiid", this.tfevtpropiaposiid);
    __sqoop$field_map.put("tfevtpropiaposiidmaster", this.tfevtpropiaposiidmaster);
    __sqoop$field_map.put("tfevtpropiaposiidfte", this.tfevtpropiaposiidfte);
    __sqoop$field_map.put("tfevtpropiaposicuenta", this.tfevtpropiaposicuenta);
    __sqoop$field_map.put("tfevtpropiaposifecha", this.tfevtpropiaposifecha);
    __sqoop$field_map.put("tfevtpropiaposilatitud", this.tfevtpropiaposilatitud);
    __sqoop$field_map.put("tfevtpropiaposilongitud", this.tfevtpropiaposilongitud);
    __sqoop$field_map.put("tfevtpropiaposivelocidad", this.tfevtpropiaposivelocidad);
    __sqoop$field_map.put("tfevtpropiaposirumbo", this.tfevtpropiaposirumbo);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("tfevtcorrsistfte", this.tfevtcorrsistfte);
    __sqoop$field_map.put("tfevtpropiaid", this.tfevtpropiaid);
    __sqoop$field_map.put("tfevtpropiaposiid", this.tfevtpropiaposiid);
    __sqoop$field_map.put("tfevtpropiaposiidmaster", this.tfevtpropiaposiidmaster);
    __sqoop$field_map.put("tfevtpropiaposiidfte", this.tfevtpropiaposiidfte);
    __sqoop$field_map.put("tfevtpropiaposicuenta", this.tfevtpropiaposicuenta);
    __sqoop$field_map.put("tfevtpropiaposifecha", this.tfevtpropiaposifecha);
    __sqoop$field_map.put("tfevtpropiaposilatitud", this.tfevtpropiaposilatitud);
    __sqoop$field_map.put("tfevtpropiaposilongitud", this.tfevtpropiaposilongitud);
    __sqoop$field_map.put("tfevtpropiaposivelocidad", this.tfevtpropiaposivelocidad);
    __sqoop$field_map.put("tfevtpropiaposirumbo", this.tfevtpropiaposirumbo);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("tfevtcorrsistfte".equals(__fieldName)) {
      this.tfevtcorrsistfte = (Long) __fieldVal;
    }
    else    if ("tfevtpropiaid".equals(__fieldName)) {
      this.tfevtpropiaid = (Integer) __fieldVal;
    }
    else    if ("tfevtpropiaposiid".equals(__fieldName)) {
      this.tfevtpropiaposiid = (Integer) __fieldVal;
    }
    else    if ("tfevtpropiaposiidmaster".equals(__fieldName)) {
      this.tfevtpropiaposiidmaster = (Long) __fieldVal;
    }
    else    if ("tfevtpropiaposiidfte".equals(__fieldName)) {
      this.tfevtpropiaposiidfte = (Long) __fieldVal;
    }
    else    if ("tfevtpropiaposicuenta".equals(__fieldName)) {
      this.tfevtpropiaposicuenta = (Boolean) __fieldVal;
    }
    else    if ("tfevtpropiaposifecha".equals(__fieldName)) {
      this.tfevtpropiaposifecha = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("tfevtpropiaposilatitud".equals(__fieldName)) {
      this.tfevtpropiaposilatitud = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tfevtpropiaposilongitud".equals(__fieldName)) {
      this.tfevtpropiaposilongitud = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tfevtpropiaposivelocidad".equals(__fieldName)) {
      this.tfevtpropiaposivelocidad = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tfevtpropiaposirumbo".equals(__fieldName)) {
      this.tfevtpropiaposirumbo = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("tfevtcorrsistfte".equals(__fieldName)) {
      this.tfevtcorrsistfte = (Long) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaid".equals(__fieldName)) {
      this.tfevtpropiaid = (Integer) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaposiid".equals(__fieldName)) {
      this.tfevtpropiaposiid = (Integer) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaposiidmaster".equals(__fieldName)) {
      this.tfevtpropiaposiidmaster = (Long) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaposiidfte".equals(__fieldName)) {
      this.tfevtpropiaposiidfte = (Long) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaposicuenta".equals(__fieldName)) {
      this.tfevtpropiaposicuenta = (Boolean) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaposifecha".equals(__fieldName)) {
      this.tfevtpropiaposifecha = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaposilatitud".equals(__fieldName)) {
      this.tfevtpropiaposilatitud = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaposilongitud".equals(__fieldName)) {
      this.tfevtpropiaposilongitud = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaposivelocidad".equals(__fieldName)) {
      this.tfevtpropiaposivelocidad = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("tfevtpropiaposirumbo".equals(__fieldName)) {
      this.tfevtpropiaposirumbo = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
