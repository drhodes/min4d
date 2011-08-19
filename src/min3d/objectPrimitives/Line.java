package min3d.objectPrimitives;

import min3d.Utils;
import min3d.core.Object3dContainer;
import min3d.vos.Color4;
import min3d.vos.Number3d;
import min3d.vos.RenderType;

public class Line extends Object3dContainer
{
  private Number3d _src;
  private Number3d _tgt;
  private float _width;
  private Color4 _color;
  
  public Line( Number3d $src,
               Number3d $tgt,
               float $width,
               Color4 $color ) {
    super(4, 2, false, true, true);
    
    _src = $src;
    _tgt = $tgt;
    _color = $color;
    _width = $width;

    renderType(RenderType.LINES);
    lineWidth($width);
    colorMaterialEnabled(true);

    short v1, v2;

    v1 = this.vertices().addVertex( _src.x, _src.y, _src.z,
                                    0f,0f,	0,1,0, _color.r, _color.g, _color.b, _color.a);   
    v2 = this.vertices().addVertex( _tgt.x, _tgt.y, _tgt.z,
                                    0f,0f,	0,1,0, _color.r, _color.g, _color.b, _color.a);
    
    this.faces().add(v1, v2, v2);
    this.faces().add(v1, v1, v2);
  }
}
