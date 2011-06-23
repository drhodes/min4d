package min3d.vos;

/**
 *  A container for the 4 rays that define
 */
public class CameraRays
{
  public final float w, h, aspect;
  public final Number3d r1, r2, r3, r4;

  public CameraRays(CameraVo $cam, float $w, float $h) {
    FrustumManaged frustum = $cam.frustum;
    w = $w;
    h = $h;
    
    assert(h != 0);
    aspect = w/h;
    
    float n = frustum.shortSideLength() / 2f;
    
    float lt, rt, btm, top;
    
    lt = frustum.horizontalCenter() - n * aspect;
    rt = frustum.horizontalCenter() + n * aspect;
    btm = frustum.verticalCenter() - n * 1;
    top = frustum.verticalCenter() + n * 1;

    if (aspect > 1) {
      lt *= 1f / aspect;
      rt *= 1f / aspect;
      btm *= 1f / aspect;
      top *= 1f / aspect;
    }


    r1 = new Number3d(0,0,0);
    r2 = new Number3d(0,0,0);
    r3 = new Number3d(0,0,0);
    r4 = new Number3d(0,0,0);
  }
}
