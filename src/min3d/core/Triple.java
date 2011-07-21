package min3d.core;
import min3d.vos.Number3d;

public class Triple {
  public final Number3d _v1;
  public final Number3d _v2;
  public final Number3d _v3;
  
  public Triple(Number3d v1, Number3d v2, Number3d v3) {  
    _v1 = v1;
    _v2 = v2;
    _v3 = v3;
  }

  public String toString(){
    return
        "<Triple "
        + _v1.toString() + " | "
        + _v2.toString() + " | "
        + _v3.toString() + ">";
  }
  
}