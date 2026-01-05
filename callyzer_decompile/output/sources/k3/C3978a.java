package k3;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;
import org.xmlpull.v1.XmlPullParser;
import t5.AbstractC7044b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k3.a */
/* loaded from: classes.dex */
public final class C3978a {

    /* renamed from: a */
    public final XmlPullParser f20638a;

    /* renamed from: b */
    public int f20639b = 0;

    /* renamed from: c */
    public final C5047i f20640c;

    public C3978a(XmlResourceParser xmlResourceParser) {
        this.f20638a = xmlResourceParser;
        C5047i c5047i = new C5047i(27);
        c5047i.f24823b = new float[64];
        this.f20640c = c5047i;
    }

    /* renamed from: a */
    public final float m8756a(TypedArray typedArray, String str, int i10, float f6) {
        if (AbstractC7044b.m13332c(this.f20638a, str)) {
            f6 = typedArray.getFloat(i10, f6);
        }
        m8757b(typedArray.getChangingConfigurations());
        return f6;
    }

    /* renamed from: b */
    public final void m8757b(int i10) {
        this.f20639b = i10 | this.f20639b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3978a)) {
            return false;
        }
        C3978a c3978a = (C3978a) obj;
        return AbstractC4154l.m8918a(this.f20638a, c3978a.f20638a) && this.f20639b == c3978a.f20639b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20639b) + (this.f20638a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f20638a);
        sb2.append(", config=");
        return AbstractC1452a.m4563j(sb2, this.f20639b, ')');
    }
}
