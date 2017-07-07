// ORM class for table 'tf_evento_objeto_posposicion'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 30 21:21:05 UTC 2017
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

public class tf_evento_objeto_posposicion extends SqoopRecord  implements DBWritable, Writable {
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
  public tf_evento_objeto_posposicion with_tfevtcorrsistfte(Long tfevtcorrsistfte) {
    this.tfevtcorrsistfte = tfevtcorrsistfte;
    return this;
  }
  private Integer tfevtobjetoid;
  public Integer get_tfevtobjetoid() {
    return tfevtobjetoid;
  }
  public void set_tfevtobjetoid(Integer tfevtobjetoid) {
    this.tfevtobjetoid = tfevtobjetoid;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoid(Integer tfevtobjetoid) {
    this.tfevtobjetoid = tfevtobjetoid;
    return this;
  }
  private Long tfevtobjetodetalleid;
  public Long get_tfevtobjetodetalleid() {
    return tfevtobjetodetalleid;
  }
  public void set_tfevtobjetodetalleid(Long tfevtobjetodetalleid) {
    this.tfevtobjetodetalleid = tfevtobjetodetalleid;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetodetalleid(Long tfevtobjetodetalleid) {
    this.tfevtobjetodetalleid = tfevtobjetodetalleid;
    return this;
  }
  private Integer tfevtobjetoposid;
  public Integer get_tfevtobjetoposid() {
    return tfevtobjetoposid;
  }
  public void set_tfevtobjetoposid(Integer tfevtobjetoposid) {
    this.tfevtobjetoposid = tfevtobjetoposid;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposid(Integer tfevtobjetoposid) {
    this.tfevtobjetoposid = tfevtobjetoposid;
    return this;
  }
  private Long tfevtobjetoposidcorre;
  public Long get_tfevtobjetoposidcorre() {
    return tfevtobjetoposidcorre;
  }
  public void set_tfevtobjetoposidcorre(Long tfevtobjetoposidcorre) {
    this.tfevtobjetoposidcorre = tfevtobjetoposidcorre;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposidcorre(Long tfevtobjetoposidcorre) {
    this.tfevtobjetoposidcorre = tfevtobjetoposidcorre;
    return this;
  }
  private Boolean tfevtobjetoposcuenta;
  public Boolean get_tfevtobjetoposcuenta() {
    return tfevtobjetoposcuenta;
  }
  public void set_tfevtobjetoposcuenta(Boolean tfevtobjetoposcuenta) {
    this.tfevtobjetoposcuenta = tfevtobjetoposcuenta;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposcuenta(Boolean tfevtobjetoposcuenta) {
    this.tfevtobjetoposcuenta = tfevtobjetoposcuenta;
    return this;
  }
  private Integer tfevtobjetoposorigenid;
  public Integer get_tfevtobjetoposorigenid() {
    return tfevtobjetoposorigenid;
  }
  public void set_tfevtobjetoposorigenid(Integer tfevtobjetoposorigenid) {
    this.tfevtobjetoposorigenid = tfevtobjetoposorigenid;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposorigenid(Integer tfevtobjetoposorigenid) {
    this.tfevtobjetoposorigenid = tfevtobjetoposorigenid;
    return this;
  }
  private String tfevtobjetoposorigen;
  public String get_tfevtobjetoposorigen() {
    return tfevtobjetoposorigen;
  }
  public void set_tfevtobjetoposorigen(String tfevtobjetoposorigen) {
    this.tfevtobjetoposorigen = tfevtobjetoposorigen;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposorigen(String tfevtobjetoposorigen) {
    this.tfevtobjetoposorigen = tfevtobjetoposorigen;
    return this;
  }
  private java.sql.Timestamp tfevtobjetoposfechacont;
  public java.sql.Timestamp get_tfevtobjetoposfechacont() {
    return tfevtobjetoposfechacont;
  }
  public void set_tfevtobjetoposfechacont(java.sql.Timestamp tfevtobjetoposfechacont) {
    this.tfevtobjetoposfechacont = tfevtobjetoposfechacont;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposfechacont(java.sql.Timestamp tfevtobjetoposfechacont) {
    this.tfevtobjetoposfechacont = tfevtobjetoposfechacont;
    return this;
  }
  private java.math.BigDecimal tfevtobjetoposlatitud;
  public java.math.BigDecimal get_tfevtobjetoposlatitud() {
    return tfevtobjetoposlatitud;
  }
  public void set_tfevtobjetoposlatitud(java.math.BigDecimal tfevtobjetoposlatitud) {
    this.tfevtobjetoposlatitud = tfevtobjetoposlatitud;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposlatitud(java.math.BigDecimal tfevtobjetoposlatitud) {
    this.tfevtobjetoposlatitud = tfevtobjetoposlatitud;
    return this;
  }
  private java.math.BigDecimal tfevtobjetoposlongitud;
  public java.math.BigDecimal get_tfevtobjetoposlongitud() {
    return tfevtobjetoposlongitud;
  }
  public void set_tfevtobjetoposlongitud(java.math.BigDecimal tfevtobjetoposlongitud) {
    this.tfevtobjetoposlongitud = tfevtobjetoposlongitud;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposlongitud(java.math.BigDecimal tfevtobjetoposlongitud) {
    this.tfevtobjetoposlongitud = tfevtobjetoposlongitud;
    return this;
  }
  private java.math.BigDecimal tfevtobjetoposrumbo;
  public java.math.BigDecimal get_tfevtobjetoposrumbo() {
    return tfevtobjetoposrumbo;
  }
  public void set_tfevtobjetoposrumbo(java.math.BigDecimal tfevtobjetoposrumbo) {
    this.tfevtobjetoposrumbo = tfevtobjetoposrumbo;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposrumbo(java.math.BigDecimal tfevtobjetoposrumbo) {
    this.tfevtobjetoposrumbo = tfevtobjetoposrumbo;
    return this;
  }
  private java.math.BigDecimal tfevtobjetoposvelocidad;
  public java.math.BigDecimal get_tfevtobjetoposvelocidad() {
    return tfevtobjetoposvelocidad;
  }
  public void set_tfevtobjetoposvelocidad(java.math.BigDecimal tfevtobjetoposvelocidad) {
    this.tfevtobjetoposvelocidad = tfevtobjetoposvelocidad;
  }
  public tf_evento_objeto_posposicion with_tfevtobjetoposvelocidad(java.math.BigDecimal tfevtobjetoposvelocidad) {
    this.tfevtobjetoposvelocidad = tfevtobjetoposvelocidad;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tf_evento_objeto_posposicion)) {
      return false;
    }
    tf_evento_objeto_posposicion that = (tf_evento_objeto_posposicion) o;
    boolean equal = true;
    equal = equal && (this.tfevtcorrsistfte == null ? that.tfevtcorrsistfte == null : this.tfevtcorrsistfte.equals(that.tfevtcorrsistfte));
    equal = equal && (this.tfevtobjetoid == null ? that.tfevtobjetoid == null : this.tfevtobjetoid.equals(that.tfevtobjetoid));
    equal = equal && (this.tfevtobjetodetalleid == null ? that.tfevtobjetodetalleid == null : this.tfevtobjetodetalleid.equals(that.tfevtobjetodetalleid));
    equal = equal && (this.tfevtobjetoposid == null ? that.tfevtobjetoposid == null : this.tfevtobjetoposid.equals(that.tfevtobjetoposid));
    equal = equal && (this.tfevtobjetoposidcorre == null ? that.tfevtobjetoposidcorre == null : this.tfevtobjetoposidcorre.equals(that.tfevtobjetoposidcorre));
    equal = equal && (this.tfevtobjetoposcuenta == null ? that.tfevtobjetoposcuenta == null : this.tfevtobjetoposcuenta.equals(that.tfevtobjetoposcuenta));
    equal = equal && (this.tfevtobjetoposorigenid == null ? that.tfevtobjetoposorigenid == null : this.tfevtobjetoposorigenid.equals(that.tfevtobjetoposorigenid));
    equal = equal && (this.tfevtobjetoposorigen == null ? that.tfevtobjetoposorigen == null : this.tfevtobjetoposorigen.equals(that.tfevtobjetoposorigen));
    equal = equal && (this.tfevtobjetoposfechacont == null ? that.tfevtobjetoposfechacont == null : this.tfevtobjetoposfechacont.equals(that.tfevtobjetoposfechacont));
    equal = equal && (this.tfevtobjetoposlatitud == null ? that.tfevtobjetoposlatitud == null : this.tfevtobjetoposlatitud.equals(that.tfevtobjetoposlatitud));
    equal = equal && (this.tfevtobjetoposlongitud == null ? that.tfevtobjetoposlongitud == null : this.tfevtobjetoposlongitud.equals(that.tfevtobjetoposlongitud));
    equal = equal && (this.tfevtobjetoposrumbo == null ? that.tfevtobjetoposrumbo == null : this.tfevtobjetoposrumbo.equals(that.tfevtobjetoposrumbo));
    equal = equal && (this.tfevtobjetoposvelocidad == null ? that.tfevtobjetoposvelocidad == null : this.tfevtobjetoposvelocidad.equals(that.tfevtobjetoposvelocidad));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tf_evento_objeto_posposicion)) {
      return false;
    }
    tf_evento_objeto_posposicion that = (tf_evento_objeto_posposicion) o;
    boolean equal = true;
    equal = equal && (this.tfevtcorrsistfte == null ? that.tfevtcorrsistfte == null : this.tfevtcorrsistfte.equals(that.tfevtcorrsistfte));
    equal = equal && (this.tfevtobjetoid == null ? that.tfevtobjetoid == null : this.tfevtobjetoid.equals(that.tfevtobjetoid));
    equal = equal && (this.tfevtobjetodetalleid == null ? that.tfevtobjetodetalleid == null : this.tfevtobjetodetalleid.equals(that.tfevtobjetodetalleid));
    equal = equal && (this.tfevtobjetoposid == null ? that.tfevtobjetoposid == null : this.tfevtobjetoposid.equals(that.tfevtobjetoposid));
    equal = equal && (this.tfevtobjetoposidcorre == null ? that.tfevtobjetoposidcorre == null : this.tfevtobjetoposidcorre.equals(that.tfevtobjetoposidcorre));
    equal = equal && (this.tfevtobjetoposcuenta == null ? that.tfevtobjetoposcuenta == null : this.tfevtobjetoposcuenta.equals(that.tfevtobjetoposcuenta));
    equal = equal && (this.tfevtobjetoposorigenid == null ? that.tfevtobjetoposorigenid == null : this.tfevtobjetoposorigenid.equals(that.tfevtobjetoposorigenid));
    equal = equal && (this.tfevtobjetoposorigen == null ? that.tfevtobjetoposorigen == null : this.tfevtobjetoposorigen.equals(that.tfevtobjetoposorigen));
    equal = equal && (this.tfevtobjetoposfechacont == null ? that.tfevtobjetoposfechacont == null : this.tfevtobjetoposfechacont.equals(that.tfevtobjetoposfechacont));
    equal = equal && (this.tfevtobjetoposlatitud == null ? that.tfevtobjetoposlatitud == null : this.tfevtobjetoposlatitud.equals(that.tfevtobjetoposlatitud));
    equal = equal && (this.tfevtobjetoposlongitud == null ? that.tfevtobjetoposlongitud == null : this.tfevtobjetoposlongitud.equals(that.tfevtobjetoposlongitud));
    equal = equal && (this.tfevtobjetoposrumbo == null ? that.tfevtobjetoposrumbo == null : this.tfevtobjetoposrumbo.equals(that.tfevtobjetoposrumbo));
    equal = equal && (this.tfevtobjetoposvelocidad == null ? that.tfevtobjetoposvelocidad == null : this.tfevtobjetoposvelocidad.equals(that.tfevtobjetoposvelocidad));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.tfevtcorrsistfte = JdbcWritableBridge.readLong(1, __dbResults);
    this.tfevtobjetoid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.tfevtobjetodetalleid = JdbcWritableBridge.readLong(3, __dbResults);
    this.tfevtobjetoposid = JdbcWritableBridge.readInteger(4, __dbResults);
    this.tfevtobjetoposidcorre = JdbcWritableBridge.readLong(5, __dbResults);
    this.tfevtobjetoposcuenta = JdbcWritableBridge.readBoolean(6, __dbResults);
    this.tfevtobjetoposorigenid = JdbcWritableBridge.readInteger(7, __dbResults);
    this.tfevtobjetoposorigen = JdbcWritableBridge.readString(8, __dbResults);
    this.tfevtobjetoposfechacont = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.tfevtobjetoposlatitud = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.tfevtobjetoposlongitud = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.tfevtobjetoposrumbo = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.tfevtobjetoposvelocidad = JdbcWritableBridge.readBigDecimal(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.tfevtcorrsistfte = JdbcWritableBridge.readLong(1, __dbResults);
    this.tfevtobjetoid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.tfevtobjetodetalleid = JdbcWritableBridge.readLong(3, __dbResults);
    this.tfevtobjetoposid = JdbcWritableBridge.readInteger(4, __dbResults);
    this.tfevtobjetoposidcorre = JdbcWritableBridge.readLong(5, __dbResults);
    this.tfevtobjetoposcuenta = JdbcWritableBridge.readBoolean(6, __dbResults);
    this.tfevtobjetoposorigenid = JdbcWritableBridge.readInteger(7, __dbResults);
    this.tfevtobjetoposorigen = JdbcWritableBridge.readString(8, __dbResults);
    this.tfevtobjetoposfechacont = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.tfevtobjetoposlatitud = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.tfevtobjetoposlongitud = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.tfevtobjetoposrumbo = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.tfevtobjetoposvelocidad = JdbcWritableBridge.readBigDecimal(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(tfevtobjetoid, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(tfevtobjetodetalleid, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(tfevtobjetoposid, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(tfevtobjetoposidcorre, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBoolean(tfevtobjetoposcuenta, 6 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeInteger(tfevtobjetoposorigenid, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(tfevtobjetoposorigen, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tfevtobjetoposfechacont, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtobjetoposlatitud, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtobjetoposlongitud, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtobjetoposrumbo, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtobjetoposvelocidad, 13 + __off, 2, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(tfevtcorrsistfte, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(tfevtobjetoid, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(tfevtobjetodetalleid, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(tfevtobjetoposid, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(tfevtobjetoposidcorre, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBoolean(tfevtobjetoposcuenta, 6 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeInteger(tfevtobjetoposorigenid, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(tfevtobjetoposorigen, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tfevtobjetoposfechacont, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtobjetoposlatitud, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtobjetoposlongitud, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtobjetoposrumbo, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tfevtobjetoposvelocidad, 13 + __off, 2, __dbStmt);
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
        this.tfevtobjetoid = null;
    } else {
    this.tfevtobjetoid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetodetalleid = null;
    } else {
    this.tfevtobjetodetalleid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposid = null;
    } else {
    this.tfevtobjetoposid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposidcorre = null;
    } else {
    this.tfevtobjetoposidcorre = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposcuenta = null;
    } else {
    this.tfevtobjetoposcuenta = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposorigenid = null;
    } else {
    this.tfevtobjetoposorigenid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposorigen = null;
    } else {
    this.tfevtobjetoposorigen = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposfechacont = null;
    } else {
    this.tfevtobjetoposfechacont = new Timestamp(__dataIn.readLong());
    this.tfevtobjetoposfechacont.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposlatitud = null;
    } else {
    this.tfevtobjetoposlatitud = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposlongitud = null;
    } else {
    this.tfevtobjetoposlongitud = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposrumbo = null;
    } else {
    this.tfevtobjetoposrumbo = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tfevtobjetoposvelocidad = null;
    } else {
    this.tfevtobjetoposvelocidad = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.tfevtcorrsistfte) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtcorrsistfte);
    }
    if (null == this.tfevtobjetoid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtobjetoid);
    }
    if (null == this.tfevtobjetodetalleid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtobjetodetalleid);
    }
    if (null == this.tfevtobjetoposid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtobjetoposid);
    }
    if (null == this.tfevtobjetoposidcorre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtobjetoposidcorre);
    }
    if (null == this.tfevtobjetoposcuenta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.tfevtobjetoposcuenta);
    }
    if (null == this.tfevtobjetoposorigenid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtobjetoposorigenid);
    }
    if (null == this.tfevtobjetoposorigen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tfevtobjetoposorigen);
    }
    if (null == this.tfevtobjetoposfechacont) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtobjetoposfechacont.getTime());
    __dataOut.writeInt(this.tfevtobjetoposfechacont.getNanos());
    }
    if (null == this.tfevtobjetoposlatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtobjetoposlatitud, __dataOut);
    }
    if (null == this.tfevtobjetoposlongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtobjetoposlongitud, __dataOut);
    }
    if (null == this.tfevtobjetoposrumbo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtobjetoposrumbo, __dataOut);
    }
    if (null == this.tfevtobjetoposvelocidad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtobjetoposvelocidad, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.tfevtcorrsistfte) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtcorrsistfte);
    }
    if (null == this.tfevtobjetoid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtobjetoid);
    }
    if (null == this.tfevtobjetodetalleid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtobjetodetalleid);
    }
    if (null == this.tfevtobjetoposid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtobjetoposid);
    }
    if (null == this.tfevtobjetoposidcorre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtobjetoposidcorre);
    }
    if (null == this.tfevtobjetoposcuenta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.tfevtobjetoposcuenta);
    }
    if (null == this.tfevtobjetoposorigenid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tfevtobjetoposorigenid);
    }
    if (null == this.tfevtobjetoposorigen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tfevtobjetoposorigen);
    }
    if (null == this.tfevtobjetoposfechacont) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tfevtobjetoposfechacont.getTime());
    __dataOut.writeInt(this.tfevtobjetoposfechacont.getNanos());
    }
    if (null == this.tfevtobjetoposlatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtobjetoposlatitud, __dataOut);
    }
    if (null == this.tfevtobjetoposlongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtobjetoposlongitud, __dataOut);
    }
    if (null == this.tfevtobjetoposrumbo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtobjetoposrumbo, __dataOut);
    }
    if (null == this.tfevtobjetoposvelocidad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tfevtobjetoposvelocidad, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoid==null?"null":"" + tfevtobjetoid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetodetalleid==null?"null":"" + tfevtobjetodetalleid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposid==null?"null":"" + tfevtobjetoposid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposidcorre==null?"null":"" + tfevtobjetoposidcorre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposcuenta==null?"null":"" + tfevtobjetoposcuenta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposorigenid==null?"null":"" + tfevtobjetoposorigenid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposorigen==null?"null":tfevtobjetoposorigen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposfechacont==null?"null":"" + tfevtobjetoposfechacont, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposlatitud==null?"null":tfevtobjetoposlatitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposlongitud==null?"null":tfevtobjetoposlongitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposrumbo==null?"null":tfevtobjetoposrumbo.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposvelocidad==null?"null":tfevtobjetoposvelocidad.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtcorrsistfte==null?"null":"" + tfevtcorrsistfte, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoid==null?"null":"" + tfevtobjetoid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetodetalleid==null?"null":"" + tfevtobjetodetalleid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposid==null?"null":"" + tfevtobjetoposid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposidcorre==null?"null":"" + tfevtobjetoposidcorre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposcuenta==null?"null":"" + tfevtobjetoposcuenta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposorigenid==null?"null":"" + tfevtobjetoposorigenid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposorigen==null?"null":tfevtobjetoposorigen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposfechacont==null?"null":"" + tfevtobjetoposfechacont, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposlatitud==null?"null":tfevtobjetoposlatitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposlongitud==null?"null":tfevtobjetoposlongitud.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposrumbo==null?"null":tfevtobjetoposrumbo.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tfevtobjetoposvelocidad==null?"null":tfevtobjetoposvelocidad.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoid = null; } else {
      this.tfevtobjetoid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetodetalleid = null; } else {
      this.tfevtobjetodetalleid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposid = null; } else {
      this.tfevtobjetoposid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposidcorre = null; } else {
      this.tfevtobjetoposidcorre = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposcuenta = null; } else {
      this.tfevtobjetoposcuenta = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposorigenid = null; } else {
      this.tfevtobjetoposorigenid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tfevtobjetoposorigen = null; } else {
      this.tfevtobjetoposorigen = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposfechacont = null; } else {
      this.tfevtobjetoposfechacont = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposlatitud = null; } else {
      this.tfevtobjetoposlatitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposlongitud = null; } else {
      this.tfevtobjetoposlongitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposrumbo = null; } else {
      this.tfevtobjetoposrumbo = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposvelocidad = null; } else {
      this.tfevtobjetoposvelocidad = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoid = null; } else {
      this.tfevtobjetoid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetodetalleid = null; } else {
      this.tfevtobjetodetalleid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposid = null; } else {
      this.tfevtobjetoposid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposidcorre = null; } else {
      this.tfevtobjetoposidcorre = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposcuenta = null; } else {
      this.tfevtobjetoposcuenta = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposorigenid = null; } else {
      this.tfevtobjetoposorigenid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tfevtobjetoposorigen = null; } else {
      this.tfevtobjetoposorigen = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposfechacont = null; } else {
      this.tfevtobjetoposfechacont = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposlatitud = null; } else {
      this.tfevtobjetoposlatitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposlongitud = null; } else {
      this.tfevtobjetoposlongitud = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposrumbo = null; } else {
      this.tfevtobjetoposrumbo = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tfevtobjetoposvelocidad = null; } else {
      this.tfevtobjetoposvelocidad = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tf_evento_objeto_posposicion o = (tf_evento_objeto_posposicion) super.clone();
    o.tfevtobjetoposfechacont = (o.tfevtobjetoposfechacont != null) ? (java.sql.Timestamp) o.tfevtobjetoposfechacont.clone() : null;
    return o;
  }

  public void clone0(tf_evento_objeto_posposicion o) throws CloneNotSupportedException {
    o.tfevtobjetoposfechacont = (o.tfevtobjetoposfechacont != null) ? (java.sql.Timestamp) o.tfevtobjetoposfechacont.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("tfevtcorrsistfte", this.tfevtcorrsistfte);
    __sqoop$field_map.put("tfevtobjetoid", this.tfevtobjetoid);
    __sqoop$field_map.put("tfevtobjetodetalleid", this.tfevtobjetodetalleid);
    __sqoop$field_map.put("tfevtobjetoposid", this.tfevtobjetoposid);
    __sqoop$field_map.put("tfevtobjetoposidcorre", this.tfevtobjetoposidcorre);
    __sqoop$field_map.put("tfevtobjetoposcuenta", this.tfevtobjetoposcuenta);
    __sqoop$field_map.put("tfevtobjetoposorigenid", this.tfevtobjetoposorigenid);
    __sqoop$field_map.put("tfevtobjetoposorigen", this.tfevtobjetoposorigen);
    __sqoop$field_map.put("tfevtobjetoposfechacont", this.tfevtobjetoposfechacont);
    __sqoop$field_map.put("tfevtobjetoposlatitud", this.tfevtobjetoposlatitud);
    __sqoop$field_map.put("tfevtobjetoposlongitud", this.tfevtobjetoposlongitud);
    __sqoop$field_map.put("tfevtobjetoposrumbo", this.tfevtobjetoposrumbo);
    __sqoop$field_map.put("tfevtobjetoposvelocidad", this.tfevtobjetoposvelocidad);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("tfevtcorrsistfte", this.tfevtcorrsistfte);
    __sqoop$field_map.put("tfevtobjetoid", this.tfevtobjetoid);
    __sqoop$field_map.put("tfevtobjetodetalleid", this.tfevtobjetodetalleid);
    __sqoop$field_map.put("tfevtobjetoposid", this.tfevtobjetoposid);
    __sqoop$field_map.put("tfevtobjetoposidcorre", this.tfevtobjetoposidcorre);
    __sqoop$field_map.put("tfevtobjetoposcuenta", this.tfevtobjetoposcuenta);
    __sqoop$field_map.put("tfevtobjetoposorigenid", this.tfevtobjetoposorigenid);
    __sqoop$field_map.put("tfevtobjetoposorigen", this.tfevtobjetoposorigen);
    __sqoop$field_map.put("tfevtobjetoposfechacont", this.tfevtobjetoposfechacont);
    __sqoop$field_map.put("tfevtobjetoposlatitud", this.tfevtobjetoposlatitud);
    __sqoop$field_map.put("tfevtobjetoposlongitud", this.tfevtobjetoposlongitud);
    __sqoop$field_map.put("tfevtobjetoposrumbo", this.tfevtobjetoposrumbo);
    __sqoop$field_map.put("tfevtobjetoposvelocidad", this.tfevtobjetoposvelocidad);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("tfevtcorrsistfte".equals(__fieldName)) {
      this.tfevtcorrsistfte = (Long) __fieldVal;
    }
    else    if ("tfevtobjetoid".equals(__fieldName)) {
      this.tfevtobjetoid = (Integer) __fieldVal;
    }
    else    if ("tfevtobjetodetalleid".equals(__fieldName)) {
      this.tfevtobjetodetalleid = (Long) __fieldVal;
    }
    else    if ("tfevtobjetoposid".equals(__fieldName)) {
      this.tfevtobjetoposid = (Integer) __fieldVal;
    }
    else    if ("tfevtobjetoposidcorre".equals(__fieldName)) {
      this.tfevtobjetoposidcorre = (Long) __fieldVal;
    }
    else    if ("tfevtobjetoposcuenta".equals(__fieldName)) {
      this.tfevtobjetoposcuenta = (Boolean) __fieldVal;
    }
    else    if ("tfevtobjetoposorigenid".equals(__fieldName)) {
      this.tfevtobjetoposorigenid = (Integer) __fieldVal;
    }
    else    if ("tfevtobjetoposorigen".equals(__fieldName)) {
      this.tfevtobjetoposorigen = (String) __fieldVal;
    }
    else    if ("tfevtobjetoposfechacont".equals(__fieldName)) {
      this.tfevtobjetoposfechacont = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("tfevtobjetoposlatitud".equals(__fieldName)) {
      this.tfevtobjetoposlatitud = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tfevtobjetoposlongitud".equals(__fieldName)) {
      this.tfevtobjetoposlongitud = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tfevtobjetoposrumbo".equals(__fieldName)) {
      this.tfevtobjetoposrumbo = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tfevtobjetoposvelocidad".equals(__fieldName)) {
      this.tfevtobjetoposvelocidad = (java.math.BigDecimal) __fieldVal;
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
    else    if ("tfevtobjetoid".equals(__fieldName)) {
      this.tfevtobjetoid = (Integer) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetodetalleid".equals(__fieldName)) {
      this.tfevtobjetodetalleid = (Long) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposid".equals(__fieldName)) {
      this.tfevtobjetoposid = (Integer) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposidcorre".equals(__fieldName)) {
      this.tfevtobjetoposidcorre = (Long) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposcuenta".equals(__fieldName)) {
      this.tfevtobjetoposcuenta = (Boolean) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposorigenid".equals(__fieldName)) {
      this.tfevtobjetoposorigenid = (Integer) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposorigen".equals(__fieldName)) {
      this.tfevtobjetoposorigen = (String) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposfechacont".equals(__fieldName)) {
      this.tfevtobjetoposfechacont = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposlatitud".equals(__fieldName)) {
      this.tfevtobjetoposlatitud = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposlongitud".equals(__fieldName)) {
      this.tfevtobjetoposlongitud = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposrumbo".equals(__fieldName)) {
      this.tfevtobjetoposrumbo = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("tfevtobjetoposvelocidad".equals(__fieldName)) {
      this.tfevtobjetoposvelocidad = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
