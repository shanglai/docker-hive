// ORM class for table 'to_sismep_posiciones'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 30 21:17:35 UTC 2017
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

public class to_sismep_posiciones extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long tosismeppocorrsistori;
  public Long get_tosismeppocorrsistori() {
    return tosismeppocorrsistori;
  }
  public void set_tosismeppocorrsistori(Long tosismeppocorrsistori) {
    this.tosismeppocorrsistori = tosismeppocorrsistori;
  }
  public to_sismep_posiciones with_tosismeppocorrsistori(Long tosismeppocorrsistori) {
    this.tosismeppocorrsistori = tosismeppocorrsistori;
    return this;
  }
  private java.sql.Timestamp tosismeppofechcaplote;
  public java.sql.Timestamp get_tosismeppofechcaplote() {
    return tosismeppofechcaplote;
  }
  public void set_tosismeppofechcaplote(java.sql.Timestamp tosismeppofechcaplote) {
    this.tosismeppofechcaplote = tosismeppofechcaplote;
  }
  public to_sismep_posiciones with_tosismeppofechcaplote(java.sql.Timestamp tosismeppofechcaplote) {
    this.tosismeppofechcaplote = tosismeppofechcaplote;
    return this;
  }
  private java.sql.Timestamp tosismeppofechcapreg;
  public java.sql.Timestamp get_tosismeppofechcapreg() {
    return tosismeppofechcapreg;
  }
  public void set_tosismeppofechcapreg(java.sql.Timestamp tosismeppofechcapreg) {
    this.tosismeppofechcapreg = tosismeppofechcapreg;
  }
  public to_sismep_posiciones with_tosismeppofechcapreg(java.sql.Timestamp tosismeppofechcapreg) {
    this.tosismeppofechcapreg = tosismeppofechcapreg;
    return this;
  }
  private String tosismepponaveid;
  public String get_tosismepponaveid() {
    return tosismepponaveid;
  }
  public void set_tosismepponaveid(String tosismepponaveid) {
    this.tosismepponaveid = tosismepponaveid;
  }
  public to_sismep_posiciones with_tosismepponaveid(String tosismepponaveid) {
    this.tosismepponaveid = tosismepponaveid;
    return this;
  }
  private String tosismeppoposilatitud;
  public String get_tosismeppoposilatitud() {
    return tosismeppoposilatitud;
  }
  public void set_tosismeppoposilatitud(String tosismeppoposilatitud) {
    this.tosismeppoposilatitud = tosismeppoposilatitud;
  }
  public to_sismep_posiciones with_tosismeppoposilatitud(String tosismeppoposilatitud) {
    this.tosismeppoposilatitud = tosismeppoposilatitud;
    return this;
  }
  private String tosismeppoposilongitud;
  public String get_tosismeppoposilongitud() {
    return tosismeppoposilongitud;
  }
  public void set_tosismeppoposilongitud(String tosismeppoposilongitud) {
    this.tosismeppoposilongitud = tosismeppoposilongitud;
  }
  public to_sismep_posiciones with_tosismeppoposilongitud(String tosismeppoposilongitud) {
    this.tosismeppoposilongitud = tosismeppoposilongitud;
    return this;
  }
  private String tosismepporumbo;
  public String get_tosismepporumbo() {
    return tosismepporumbo;
  }
  public void set_tosismepporumbo(String tosismepporumbo) {
    this.tosismepporumbo = tosismepporumbo;
  }
  public to_sismep_posiciones with_tosismepporumbo(String tosismepporumbo) {
    this.tosismepporumbo = tosismepporumbo;
    return this;
  }
  private String tosismeppovelocidad;
  public String get_tosismeppovelocidad() {
    return tosismeppovelocidad;
  }
  public void set_tosismeppovelocidad(String tosismeppovelocidad) {
    this.tosismeppovelocidad = tosismeppovelocidad;
  }
  public to_sismep_posiciones with_tosismeppovelocidad(String tosismeppovelocidad) {
    this.tosismeppovelocidad = tosismeppovelocidad;
    return this;
  }
  private String tosismeppofechcontacto;
  public String get_tosismeppofechcontacto() {
    return tosismeppofechcontacto;
  }
  public void set_tosismeppofechcontacto(String tosismeppofechcontacto) {
    this.tosismeppofechcontacto = tosismeppofechcontacto;
  }
  public to_sismep_posiciones with_tosismeppofechcontacto(String tosismeppofechcontacto) {
    this.tosismeppofechcontacto = tosismeppofechcontacto;
    return this;
  }
  private String tosismeppoalertaemerg;
  public String get_tosismeppoalertaemerg() {
    return tosismeppoalertaemerg;
  }
  public void set_tosismeppoalertaemerg(String tosismeppoalertaemerg) {
    this.tosismeppoalertaemerg = tosismeppoalertaemerg;
  }
  public to_sismep_posiciones with_tosismeppoalertaemerg(String tosismeppoalertaemerg) {
    this.tosismeppoalertaemerg = tosismeppoalertaemerg;
    return this;
  }
  private String tosismepponaveenpuerto;
  public String get_tosismepponaveenpuerto() {
    return tosismepponaveenpuerto;
  }
  public void set_tosismepponaveenpuerto(String tosismepponaveenpuerto) {
    this.tosismepponaveenpuerto = tosismepponaveenpuerto;
  }
  public to_sismep_posiciones with_tosismepponaveenpuerto(String tosismepponaveenpuerto) {
    this.tosismepponaveenpuerto = tosismepponaveenpuerto;
    return this;
  }
  private String tosismepponavezonaproh;
  public String get_tosismepponavezonaproh() {
    return tosismepponavezonaproh;
  }
  public void set_tosismepponavezonaproh(String tosismepponavezonaproh) {
    this.tosismepponavezonaproh = tosismepponavezonaproh;
  }
  public to_sismep_posiciones with_tosismepponavezonaproh(String tosismepponavezonaproh) {
    this.tosismepponavezonaproh = tosismepponavezonaproh;
    return this;
  }
  private String tosismeppoavinavezonaproh;
  public String get_tosismeppoavinavezonaproh() {
    return tosismeppoavinavezonaproh;
  }
  public void set_tosismeppoavinavezonaproh(String tosismeppoavinavezonaproh) {
    this.tosismeppoavinavezonaproh = tosismeppoavinavezonaproh;
  }
  public to_sismep_posiciones with_tosismeppoavinavezonaproh(String tosismeppoavinavezonaproh) {
    this.tosismeppoavinavezonaproh = tosismeppoavinavezonaproh;
    return this;
  }
  private String tosismepponaveautzonaproh;
  public String get_tosismepponaveautzonaproh() {
    return tosismepponaveautzonaproh;
  }
  public void set_tosismepponaveautzonaproh(String tosismepponaveautzonaproh) {
    this.tosismepponaveautzonaproh = tosismepponaveautzonaproh;
  }
  public to_sismep_posiciones with_tosismepponaveautzonaproh(String tosismepponaveautzonaproh) {
    this.tosismepponaveautzonaproh = tosismepponaveautzonaproh;
    return this;
  }
  private String tosismeppoavinaveautzonaproh;
  public String get_tosismeppoavinaveautzonaproh() {
    return tosismeppoavinaveautzonaproh;
  }
  public void set_tosismeppoavinaveautzonaproh(String tosismeppoavinaveautzonaproh) {
    this.tosismeppoavinaveautzonaproh = tosismeppoavinaveautzonaproh;
  }
  public to_sismep_posiciones with_tosismeppoavinaveautzonaproh(String tosismeppoavinaveautzonaproh) {
    this.tosismeppoavinaveautzonaproh = tosismeppoavinaveautzonaproh;
    return this;
  }
  private Boolean tosismeppoprocesado;
  public Boolean get_tosismeppoprocesado() {
    return tosismeppoprocesado;
  }
  public void set_tosismeppoprocesado(Boolean tosismeppoprocesado) {
    this.tosismeppoprocesado = tosismeppoprocesado;
  }
  public to_sismep_posiciones with_tosismeppoprocesado(Boolean tosismeppoprocesado) {
    this.tosismeppoprocesado = tosismeppoprocesado;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof to_sismep_posiciones)) {
      return false;
    }
    to_sismep_posiciones that = (to_sismep_posiciones) o;
    boolean equal = true;
    equal = equal && (this.tosismeppocorrsistori == null ? that.tosismeppocorrsistori == null : this.tosismeppocorrsistori.equals(that.tosismeppocorrsistori));
    equal = equal && (this.tosismeppofechcaplote == null ? that.tosismeppofechcaplote == null : this.tosismeppofechcaplote.equals(that.tosismeppofechcaplote));
    equal = equal && (this.tosismeppofechcapreg == null ? that.tosismeppofechcapreg == null : this.tosismeppofechcapreg.equals(that.tosismeppofechcapreg));
    equal = equal && (this.tosismepponaveid == null ? that.tosismepponaveid == null : this.tosismepponaveid.equals(that.tosismepponaveid));
    equal = equal && (this.tosismeppoposilatitud == null ? that.tosismeppoposilatitud == null : this.tosismeppoposilatitud.equals(that.tosismeppoposilatitud));
    equal = equal && (this.tosismeppoposilongitud == null ? that.tosismeppoposilongitud == null : this.tosismeppoposilongitud.equals(that.tosismeppoposilongitud));
    equal = equal && (this.tosismepporumbo == null ? that.tosismepporumbo == null : this.tosismepporumbo.equals(that.tosismepporumbo));
    equal = equal && (this.tosismeppovelocidad == null ? that.tosismeppovelocidad == null : this.tosismeppovelocidad.equals(that.tosismeppovelocidad));
    equal = equal && (this.tosismeppofechcontacto == null ? that.tosismeppofechcontacto == null : this.tosismeppofechcontacto.equals(that.tosismeppofechcontacto));
    equal = equal && (this.tosismeppoalertaemerg == null ? that.tosismeppoalertaemerg == null : this.tosismeppoalertaemerg.equals(that.tosismeppoalertaemerg));
    equal = equal && (this.tosismepponaveenpuerto == null ? that.tosismepponaveenpuerto == null : this.tosismepponaveenpuerto.equals(that.tosismepponaveenpuerto));
    equal = equal && (this.tosismepponavezonaproh == null ? that.tosismepponavezonaproh == null : this.tosismepponavezonaproh.equals(that.tosismepponavezonaproh));
    equal = equal && (this.tosismeppoavinavezonaproh == null ? that.tosismeppoavinavezonaproh == null : this.tosismeppoavinavezonaproh.equals(that.tosismeppoavinavezonaproh));
    equal = equal && (this.tosismepponaveautzonaproh == null ? that.tosismepponaveautzonaproh == null : this.tosismepponaveautzonaproh.equals(that.tosismepponaveautzonaproh));
    equal = equal && (this.tosismeppoavinaveautzonaproh == null ? that.tosismeppoavinaveautzonaproh == null : this.tosismeppoavinaveautzonaproh.equals(that.tosismeppoavinaveautzonaproh));
    equal = equal && (this.tosismeppoprocesado == null ? that.tosismeppoprocesado == null : this.tosismeppoprocesado.equals(that.tosismeppoprocesado));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof to_sismep_posiciones)) {
      return false;
    }
    to_sismep_posiciones that = (to_sismep_posiciones) o;
    boolean equal = true;
    equal = equal && (this.tosismeppocorrsistori == null ? that.tosismeppocorrsistori == null : this.tosismeppocorrsistori.equals(that.tosismeppocorrsistori));
    equal = equal && (this.tosismeppofechcaplote == null ? that.tosismeppofechcaplote == null : this.tosismeppofechcaplote.equals(that.tosismeppofechcaplote));
    equal = equal && (this.tosismeppofechcapreg == null ? that.tosismeppofechcapreg == null : this.tosismeppofechcapreg.equals(that.tosismeppofechcapreg));
    equal = equal && (this.tosismepponaveid == null ? that.tosismepponaveid == null : this.tosismepponaveid.equals(that.tosismepponaveid));
    equal = equal && (this.tosismeppoposilatitud == null ? that.tosismeppoposilatitud == null : this.tosismeppoposilatitud.equals(that.tosismeppoposilatitud));
    equal = equal && (this.tosismeppoposilongitud == null ? that.tosismeppoposilongitud == null : this.tosismeppoposilongitud.equals(that.tosismeppoposilongitud));
    equal = equal && (this.tosismepporumbo == null ? that.tosismepporumbo == null : this.tosismepporumbo.equals(that.tosismepporumbo));
    equal = equal && (this.tosismeppovelocidad == null ? that.tosismeppovelocidad == null : this.tosismeppovelocidad.equals(that.tosismeppovelocidad));
    equal = equal && (this.tosismeppofechcontacto == null ? that.tosismeppofechcontacto == null : this.tosismeppofechcontacto.equals(that.tosismeppofechcontacto));
    equal = equal && (this.tosismeppoalertaemerg == null ? that.tosismeppoalertaemerg == null : this.tosismeppoalertaemerg.equals(that.tosismeppoalertaemerg));
    equal = equal && (this.tosismepponaveenpuerto == null ? that.tosismepponaveenpuerto == null : this.tosismepponaveenpuerto.equals(that.tosismepponaveenpuerto));
    equal = equal && (this.tosismepponavezonaproh == null ? that.tosismepponavezonaproh == null : this.tosismepponavezonaproh.equals(that.tosismepponavezonaproh));
    equal = equal && (this.tosismeppoavinavezonaproh == null ? that.tosismeppoavinavezonaproh == null : this.tosismeppoavinavezonaproh.equals(that.tosismeppoavinavezonaproh));
    equal = equal && (this.tosismepponaveautzonaproh == null ? that.tosismepponaveautzonaproh == null : this.tosismepponaveautzonaproh.equals(that.tosismepponaveautzonaproh));
    equal = equal && (this.tosismeppoavinaveautzonaproh == null ? that.tosismeppoavinaveautzonaproh == null : this.tosismeppoavinaveautzonaproh.equals(that.tosismeppoavinaveautzonaproh));
    equal = equal && (this.tosismeppoprocesado == null ? that.tosismeppoprocesado == null : this.tosismeppoprocesado.equals(that.tosismeppoprocesado));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.tosismeppocorrsistori = JdbcWritableBridge.readLong(1, __dbResults);
    this.tosismeppofechcaplote = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.tosismeppofechcapreg = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.tosismepponaveid = JdbcWritableBridge.readString(4, __dbResults);
    this.tosismeppoposilatitud = JdbcWritableBridge.readString(5, __dbResults);
    this.tosismeppoposilongitud = JdbcWritableBridge.readString(6, __dbResults);
    this.tosismepporumbo = JdbcWritableBridge.readString(7, __dbResults);
    this.tosismeppovelocidad = JdbcWritableBridge.readString(8, __dbResults);
    this.tosismeppofechcontacto = JdbcWritableBridge.readString(9, __dbResults);
    this.tosismeppoalertaemerg = JdbcWritableBridge.readString(10, __dbResults);
    this.tosismepponaveenpuerto = JdbcWritableBridge.readString(11, __dbResults);
    this.tosismepponavezonaproh = JdbcWritableBridge.readString(12, __dbResults);
    this.tosismeppoavinavezonaproh = JdbcWritableBridge.readString(13, __dbResults);
    this.tosismepponaveautzonaproh = JdbcWritableBridge.readString(14, __dbResults);
    this.tosismeppoavinaveautzonaproh = JdbcWritableBridge.readString(15, __dbResults);
    this.tosismeppoprocesado = JdbcWritableBridge.readBoolean(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.tosismeppocorrsistori = JdbcWritableBridge.readLong(1, __dbResults);
    this.tosismeppofechcaplote = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.tosismeppofechcapreg = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.tosismepponaveid = JdbcWritableBridge.readString(4, __dbResults);
    this.tosismeppoposilatitud = JdbcWritableBridge.readString(5, __dbResults);
    this.tosismeppoposilongitud = JdbcWritableBridge.readString(6, __dbResults);
    this.tosismepporumbo = JdbcWritableBridge.readString(7, __dbResults);
    this.tosismeppovelocidad = JdbcWritableBridge.readString(8, __dbResults);
    this.tosismeppofechcontacto = JdbcWritableBridge.readString(9, __dbResults);
    this.tosismeppoalertaemerg = JdbcWritableBridge.readString(10, __dbResults);
    this.tosismepponaveenpuerto = JdbcWritableBridge.readString(11, __dbResults);
    this.tosismepponavezonaproh = JdbcWritableBridge.readString(12, __dbResults);
    this.tosismeppoavinavezonaproh = JdbcWritableBridge.readString(13, __dbResults);
    this.tosismepponaveautzonaproh = JdbcWritableBridge.readString(14, __dbResults);
    this.tosismeppoavinaveautzonaproh = JdbcWritableBridge.readString(15, __dbResults);
    this.tosismeppoprocesado = JdbcWritableBridge.readBoolean(16, __dbResults);
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
    JdbcWritableBridge.writeLong(tosismeppocorrsistori, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tosismeppofechcaplote, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tosismeppofechcapreg, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(tosismepponaveid, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoposilatitud, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoposilongitud, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismepporumbo, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppovelocidad, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppofechcontacto, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoalertaemerg, 10 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismepponaveenpuerto, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismepponavezonaproh, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoavinavezonaproh, 13 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismepponaveautzonaproh, 14 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoavinaveautzonaproh, 15 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBoolean(tosismeppoprocesado, 16 + __off, -7, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(tosismeppocorrsistori, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tosismeppofechcaplote, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tosismeppofechcapreg, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(tosismepponaveid, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoposilatitud, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoposilongitud, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismepporumbo, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppovelocidad, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppofechcontacto, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoalertaemerg, 10 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismepponaveenpuerto, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismepponavezonaproh, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoavinavezonaproh, 13 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismepponaveautzonaproh, 14 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(tosismeppoavinaveautzonaproh, 15 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBoolean(tosismeppoprocesado, 16 + __off, -7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.tosismeppocorrsistori = null;
    } else {
    this.tosismeppocorrsistori = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppofechcaplote = null;
    } else {
    this.tosismeppofechcaplote = new Timestamp(__dataIn.readLong());
    this.tosismeppofechcaplote.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppofechcapreg = null;
    } else {
    this.tosismeppofechcapreg = new Timestamp(__dataIn.readLong());
    this.tosismeppofechcapreg.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tosismepponaveid = null;
    } else {
    this.tosismepponaveid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppoposilatitud = null;
    } else {
    this.tosismeppoposilatitud = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppoposilongitud = null;
    } else {
    this.tosismeppoposilongitud = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismepporumbo = null;
    } else {
    this.tosismepporumbo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppovelocidad = null;
    } else {
    this.tosismeppovelocidad = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppofechcontacto = null;
    } else {
    this.tosismeppofechcontacto = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppoalertaemerg = null;
    } else {
    this.tosismeppoalertaemerg = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismepponaveenpuerto = null;
    } else {
    this.tosismepponaveenpuerto = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismepponavezonaproh = null;
    } else {
    this.tosismepponavezonaproh = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppoavinavezonaproh = null;
    } else {
    this.tosismeppoavinavezonaproh = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismepponaveautzonaproh = null;
    } else {
    this.tosismepponaveautzonaproh = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppoavinaveautzonaproh = null;
    } else {
    this.tosismeppoavinaveautzonaproh = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tosismeppoprocesado = null;
    } else {
    this.tosismeppoprocesado = Boolean.valueOf(__dataIn.readBoolean());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.tosismeppocorrsistori) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tosismeppocorrsistori);
    }
    if (null == this.tosismeppofechcaplote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tosismeppofechcaplote.getTime());
    __dataOut.writeInt(this.tosismeppofechcaplote.getNanos());
    }
    if (null == this.tosismeppofechcapreg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tosismeppofechcapreg.getTime());
    __dataOut.writeInt(this.tosismeppofechcapreg.getNanos());
    }
    if (null == this.tosismepponaveid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepponaveid);
    }
    if (null == this.tosismeppoposilatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoposilatitud);
    }
    if (null == this.tosismeppoposilongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoposilongitud);
    }
    if (null == this.tosismepporumbo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepporumbo);
    }
    if (null == this.tosismeppovelocidad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppovelocidad);
    }
    if (null == this.tosismeppofechcontacto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppofechcontacto);
    }
    if (null == this.tosismeppoalertaemerg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoalertaemerg);
    }
    if (null == this.tosismepponaveenpuerto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepponaveenpuerto);
    }
    if (null == this.tosismepponavezonaproh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepponavezonaproh);
    }
    if (null == this.tosismeppoavinavezonaproh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoavinavezonaproh);
    }
    if (null == this.tosismepponaveautzonaproh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepponaveautzonaproh);
    }
    if (null == this.tosismeppoavinaveautzonaproh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoavinaveautzonaproh);
    }
    if (null == this.tosismeppoprocesado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.tosismeppoprocesado);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.tosismeppocorrsistori) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tosismeppocorrsistori);
    }
    if (null == this.tosismeppofechcaplote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tosismeppofechcaplote.getTime());
    __dataOut.writeInt(this.tosismeppofechcaplote.getNanos());
    }
    if (null == this.tosismeppofechcapreg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tosismeppofechcapreg.getTime());
    __dataOut.writeInt(this.tosismeppofechcapreg.getNanos());
    }
    if (null == this.tosismepponaveid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepponaveid);
    }
    if (null == this.tosismeppoposilatitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoposilatitud);
    }
    if (null == this.tosismeppoposilongitud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoposilongitud);
    }
    if (null == this.tosismepporumbo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepporumbo);
    }
    if (null == this.tosismeppovelocidad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppovelocidad);
    }
    if (null == this.tosismeppofechcontacto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppofechcontacto);
    }
    if (null == this.tosismeppoalertaemerg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoalertaemerg);
    }
    if (null == this.tosismepponaveenpuerto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepponaveenpuerto);
    }
    if (null == this.tosismepponavezonaproh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepponavezonaproh);
    }
    if (null == this.tosismeppoavinavezonaproh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoavinavezonaproh);
    }
    if (null == this.tosismepponaveautzonaproh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismepponaveautzonaproh);
    }
    if (null == this.tosismeppoavinaveautzonaproh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tosismeppoavinaveautzonaproh);
    }
    if (null == this.tosismeppoprocesado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.tosismeppoprocesado);
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
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppocorrsistori==null?"null":"" + tosismeppocorrsistori, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppofechcaplote==null?"null":"" + tosismeppofechcaplote, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppofechcapreg==null?"null":"" + tosismeppofechcapreg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepponaveid==null?"null":tosismepponaveid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoposilatitud==null?"null":tosismeppoposilatitud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoposilongitud==null?"null":tosismeppoposilongitud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepporumbo==null?"null":tosismepporumbo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppovelocidad==null?"null":tosismeppovelocidad, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppofechcontacto==null?"null":tosismeppofechcontacto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoalertaemerg==null?"null":tosismeppoalertaemerg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepponaveenpuerto==null?"null":tosismepponaveenpuerto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepponavezonaproh==null?"null":tosismepponavezonaproh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoavinavezonaproh==null?"null":tosismeppoavinavezonaproh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepponaveautzonaproh==null?"null":tosismepponaveautzonaproh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoavinaveautzonaproh==null?"null":tosismeppoavinaveautzonaproh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoprocesado==null?"null":"" + tosismeppoprocesado, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppocorrsistori==null?"null":"" + tosismeppocorrsistori, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppofechcaplote==null?"null":"" + tosismeppofechcaplote, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppofechcapreg==null?"null":"" + tosismeppofechcapreg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepponaveid==null?"null":tosismepponaveid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoposilatitud==null?"null":tosismeppoposilatitud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoposilongitud==null?"null":tosismeppoposilongitud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepporumbo==null?"null":tosismepporumbo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppovelocidad==null?"null":tosismeppovelocidad, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppofechcontacto==null?"null":tosismeppofechcontacto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoalertaemerg==null?"null":tosismeppoalertaemerg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepponaveenpuerto==null?"null":tosismepponaveenpuerto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepponavezonaproh==null?"null":tosismepponavezonaproh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoavinavezonaproh==null?"null":tosismeppoavinavezonaproh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismepponaveautzonaproh==null?"null":tosismepponaveautzonaproh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoavinaveautzonaproh==null?"null":tosismeppoavinaveautzonaproh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tosismeppoprocesado==null?"null":"" + tosismeppoprocesado, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tosismeppocorrsistori = null; } else {
      this.tosismeppocorrsistori = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tosismeppofechcaplote = null; } else {
      this.tosismeppofechcaplote = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tosismeppofechcapreg = null; } else {
      this.tosismeppofechcapreg = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepponaveid = null; } else {
      this.tosismepponaveid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoposilatitud = null; } else {
      this.tosismeppoposilatitud = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoposilongitud = null; } else {
      this.tosismeppoposilongitud = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepporumbo = null; } else {
      this.tosismepporumbo = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppovelocidad = null; } else {
      this.tosismeppovelocidad = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppofechcontacto = null; } else {
      this.tosismeppofechcontacto = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoalertaemerg = null; } else {
      this.tosismeppoalertaemerg = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepponaveenpuerto = null; } else {
      this.tosismepponaveenpuerto = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepponavezonaproh = null; } else {
      this.tosismepponavezonaproh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoavinavezonaproh = null; } else {
      this.tosismeppoavinavezonaproh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepponaveautzonaproh = null; } else {
      this.tosismepponaveautzonaproh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoavinaveautzonaproh = null; } else {
      this.tosismeppoavinaveautzonaproh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tosismeppoprocesado = null; } else {
      this.tosismeppoprocesado = BooleanParser.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tosismeppocorrsistori = null; } else {
      this.tosismeppocorrsistori = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tosismeppofechcaplote = null; } else {
      this.tosismeppofechcaplote = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tosismeppofechcapreg = null; } else {
      this.tosismeppofechcapreg = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepponaveid = null; } else {
      this.tosismepponaveid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoposilatitud = null; } else {
      this.tosismeppoposilatitud = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoposilongitud = null; } else {
      this.tosismeppoposilongitud = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepporumbo = null; } else {
      this.tosismepporumbo = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppovelocidad = null; } else {
      this.tosismeppovelocidad = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppofechcontacto = null; } else {
      this.tosismeppofechcontacto = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoalertaemerg = null; } else {
      this.tosismeppoalertaemerg = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepponaveenpuerto = null; } else {
      this.tosismepponaveenpuerto = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepponavezonaproh = null; } else {
      this.tosismepponavezonaproh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoavinavezonaproh = null; } else {
      this.tosismeppoavinavezonaproh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismepponaveautzonaproh = null; } else {
      this.tosismepponaveautzonaproh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tosismeppoavinaveautzonaproh = null; } else {
      this.tosismeppoavinaveautzonaproh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tosismeppoprocesado = null; } else {
      this.tosismeppoprocesado = BooleanParser.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    to_sismep_posiciones o = (to_sismep_posiciones) super.clone();
    o.tosismeppofechcaplote = (o.tosismeppofechcaplote != null) ? (java.sql.Timestamp) o.tosismeppofechcaplote.clone() : null;
    o.tosismeppofechcapreg = (o.tosismeppofechcapreg != null) ? (java.sql.Timestamp) o.tosismeppofechcapreg.clone() : null;
    return o;
  }

  public void clone0(to_sismep_posiciones o) throws CloneNotSupportedException {
    o.tosismeppofechcaplote = (o.tosismeppofechcaplote != null) ? (java.sql.Timestamp) o.tosismeppofechcaplote.clone() : null;
    o.tosismeppofechcapreg = (o.tosismeppofechcapreg != null) ? (java.sql.Timestamp) o.tosismeppofechcapreg.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("tosismeppocorrsistori", this.tosismeppocorrsistori);
    __sqoop$field_map.put("tosismeppofechcaplote", this.tosismeppofechcaplote);
    __sqoop$field_map.put("tosismeppofechcapreg", this.tosismeppofechcapreg);
    __sqoop$field_map.put("tosismepponaveid", this.tosismepponaveid);
    __sqoop$field_map.put("tosismeppoposilatitud", this.tosismeppoposilatitud);
    __sqoop$field_map.put("tosismeppoposilongitud", this.tosismeppoposilongitud);
    __sqoop$field_map.put("tosismepporumbo", this.tosismepporumbo);
    __sqoop$field_map.put("tosismeppovelocidad", this.tosismeppovelocidad);
    __sqoop$field_map.put("tosismeppofechcontacto", this.tosismeppofechcontacto);
    __sqoop$field_map.put("tosismeppoalertaemerg", this.tosismeppoalertaemerg);
    __sqoop$field_map.put("tosismepponaveenpuerto", this.tosismepponaveenpuerto);
    __sqoop$field_map.put("tosismepponavezonaproh", this.tosismepponavezonaproh);
    __sqoop$field_map.put("tosismeppoavinavezonaproh", this.tosismeppoavinavezonaproh);
    __sqoop$field_map.put("tosismepponaveautzonaproh", this.tosismepponaveautzonaproh);
    __sqoop$field_map.put("tosismeppoavinaveautzonaproh", this.tosismeppoavinaveautzonaproh);
    __sqoop$field_map.put("tosismeppoprocesado", this.tosismeppoprocesado);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("tosismeppocorrsistori", this.tosismeppocorrsistori);
    __sqoop$field_map.put("tosismeppofechcaplote", this.tosismeppofechcaplote);
    __sqoop$field_map.put("tosismeppofechcapreg", this.tosismeppofechcapreg);
    __sqoop$field_map.put("tosismepponaveid", this.tosismepponaveid);
    __sqoop$field_map.put("tosismeppoposilatitud", this.tosismeppoposilatitud);
    __sqoop$field_map.put("tosismeppoposilongitud", this.tosismeppoposilongitud);
    __sqoop$field_map.put("tosismepporumbo", this.tosismepporumbo);
    __sqoop$field_map.put("tosismeppovelocidad", this.tosismeppovelocidad);
    __sqoop$field_map.put("tosismeppofechcontacto", this.tosismeppofechcontacto);
    __sqoop$field_map.put("tosismeppoalertaemerg", this.tosismeppoalertaemerg);
    __sqoop$field_map.put("tosismepponaveenpuerto", this.tosismepponaveenpuerto);
    __sqoop$field_map.put("tosismepponavezonaproh", this.tosismepponavezonaproh);
    __sqoop$field_map.put("tosismeppoavinavezonaproh", this.tosismeppoavinavezonaproh);
    __sqoop$field_map.put("tosismepponaveautzonaproh", this.tosismepponaveautzonaproh);
    __sqoop$field_map.put("tosismeppoavinaveautzonaproh", this.tosismeppoavinaveautzonaproh);
    __sqoop$field_map.put("tosismeppoprocesado", this.tosismeppoprocesado);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("tosismeppocorrsistori".equals(__fieldName)) {
      this.tosismeppocorrsistori = (Long) __fieldVal;
    }
    else    if ("tosismeppofechcaplote".equals(__fieldName)) {
      this.tosismeppofechcaplote = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("tosismeppofechcapreg".equals(__fieldName)) {
      this.tosismeppofechcapreg = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("tosismepponaveid".equals(__fieldName)) {
      this.tosismepponaveid = (String) __fieldVal;
    }
    else    if ("tosismeppoposilatitud".equals(__fieldName)) {
      this.tosismeppoposilatitud = (String) __fieldVal;
    }
    else    if ("tosismeppoposilongitud".equals(__fieldName)) {
      this.tosismeppoposilongitud = (String) __fieldVal;
    }
    else    if ("tosismepporumbo".equals(__fieldName)) {
      this.tosismepporumbo = (String) __fieldVal;
    }
    else    if ("tosismeppovelocidad".equals(__fieldName)) {
      this.tosismeppovelocidad = (String) __fieldVal;
    }
    else    if ("tosismeppofechcontacto".equals(__fieldName)) {
      this.tosismeppofechcontacto = (String) __fieldVal;
    }
    else    if ("tosismeppoalertaemerg".equals(__fieldName)) {
      this.tosismeppoalertaemerg = (String) __fieldVal;
    }
    else    if ("tosismepponaveenpuerto".equals(__fieldName)) {
      this.tosismepponaveenpuerto = (String) __fieldVal;
    }
    else    if ("tosismepponavezonaproh".equals(__fieldName)) {
      this.tosismepponavezonaproh = (String) __fieldVal;
    }
    else    if ("tosismeppoavinavezonaproh".equals(__fieldName)) {
      this.tosismeppoavinavezonaproh = (String) __fieldVal;
    }
    else    if ("tosismepponaveautzonaproh".equals(__fieldName)) {
      this.tosismepponaveautzonaproh = (String) __fieldVal;
    }
    else    if ("tosismeppoavinaveautzonaproh".equals(__fieldName)) {
      this.tosismeppoavinaveautzonaproh = (String) __fieldVal;
    }
    else    if ("tosismeppoprocesado".equals(__fieldName)) {
      this.tosismeppoprocesado = (Boolean) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("tosismeppocorrsistori".equals(__fieldName)) {
      this.tosismeppocorrsistori = (Long) __fieldVal;
      return true;
    }
    else    if ("tosismeppofechcaplote".equals(__fieldName)) {
      this.tosismeppofechcaplote = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("tosismeppofechcapreg".equals(__fieldName)) {
      this.tosismeppofechcapreg = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("tosismepponaveid".equals(__fieldName)) {
      this.tosismepponaveid = (String) __fieldVal;
      return true;
    }
    else    if ("tosismeppoposilatitud".equals(__fieldName)) {
      this.tosismeppoposilatitud = (String) __fieldVal;
      return true;
    }
    else    if ("tosismeppoposilongitud".equals(__fieldName)) {
      this.tosismeppoposilongitud = (String) __fieldVal;
      return true;
    }
    else    if ("tosismepporumbo".equals(__fieldName)) {
      this.tosismepporumbo = (String) __fieldVal;
      return true;
    }
    else    if ("tosismeppovelocidad".equals(__fieldName)) {
      this.tosismeppovelocidad = (String) __fieldVal;
      return true;
    }
    else    if ("tosismeppofechcontacto".equals(__fieldName)) {
      this.tosismeppofechcontacto = (String) __fieldVal;
      return true;
    }
    else    if ("tosismeppoalertaemerg".equals(__fieldName)) {
      this.tosismeppoalertaemerg = (String) __fieldVal;
      return true;
    }
    else    if ("tosismepponaveenpuerto".equals(__fieldName)) {
      this.tosismepponaveenpuerto = (String) __fieldVal;
      return true;
    }
    else    if ("tosismepponavezonaproh".equals(__fieldName)) {
      this.tosismepponavezonaproh = (String) __fieldVal;
      return true;
    }
    else    if ("tosismeppoavinavezonaproh".equals(__fieldName)) {
      this.tosismeppoavinavezonaproh = (String) __fieldVal;
      return true;
    }
    else    if ("tosismepponaveautzonaproh".equals(__fieldName)) {
      this.tosismepponaveautzonaproh = (String) __fieldVal;
      return true;
    }
    else    if ("tosismeppoavinaveautzonaproh".equals(__fieldName)) {
      this.tosismeppoavinaveautzonaproh = (String) __fieldVal;
      return true;
    }
    else    if ("tosismeppoprocesado".equals(__fieldName)) {
      this.tosismeppoprocesado = (Boolean) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
