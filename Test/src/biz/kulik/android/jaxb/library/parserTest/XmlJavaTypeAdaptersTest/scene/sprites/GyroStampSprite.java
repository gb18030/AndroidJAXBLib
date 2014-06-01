/*
 * GyroStampSprite.java		Date created: 21 ����. 2013
 * Last modified by: kadygrob
 * $Revision$	21 ����. 2013
 */

package biz.kulik.android.jaxb.library.parserTest.XmlJavaTypeAdaptersTest.scene.sprites;

import biz.kulik.android.jaxb.library.Annotations.XmlAttribute;
import biz.kulik.android.jaxb.library.Annotations.XmlElement;
import biz.kulik.android.jaxb.library.Annotations.XmlElementWrapper;
import biz.kulik.android.jaxb.library.parserTest.XmlJavaTypeAdaptersTest.scene.Frame;

import java.util.List;

/**
 * @author kadygrob Copyright QArea Inc, 2013
 */
public class GyroStampSprite extends SceneObject {

    @XmlAttribute(name = "startingFrame")
    public String startingFrameName;

    @XmlElement(name = "frames")
    public List<Frames> framesSetList;

    public GyroStampSprite() {
    }

    @Override
    public SceneObjectType getType() {
        return SceneObjectType.GYRO;
    }
}