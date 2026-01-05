package p001o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class sm3 {

    /* renamed from: a */
    public final Shader f45635a;

    /* renamed from: b */
    public final ColorStateList f45636b;

    /* renamed from: c */
    public int f45637c;

    public sm3(Shader shader, ColorStateList colorStateList, int i) {
        this.f45635a = shader;
        this.f45636b = colorStateList;
        this.f45637c = i;
    }

    /* renamed from: a */
    public static sm3 m48532a(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return m48535d(mu7.m39695b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m48534c(ji3.m33847b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* renamed from: b */
    public static sm3 m48533b(int i) {
        return new sm3(null, null, i);
    }

    /* renamed from: c */
    public static sm3 m48534c(ColorStateList colorStateList) {
        return new sm3(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static sm3 m48535d(Shader shader) {
        return new sm3(shader, null, 0);
    }

    /* renamed from: g */
    public static sm3 m48536g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m48532a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public int m48537e() {
        return this.f45637c;
    }

    /* renamed from: f */
    public Shader m48538f() {
        return this.f45635a;
    }

    /* renamed from: h */
    public boolean m48539h() {
        return this.f45635a != null;
    }

    /* renamed from: i */
    public boolean m48540i() {
        ColorStateList colorStateList;
        return this.f45635a == null && (colorStateList = this.f45636b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m48541j(int[] iArr) {
        if (m48540i()) {
            ColorStateList colorStateList = this.f45636b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f45637c) {
                this.f45637c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m48542k(int i) {
        this.f45637c = i;
    }

    /* renamed from: l */
    public boolean m48543l() {
        return m48539h() || this.f45637c != 0;
    }
}
