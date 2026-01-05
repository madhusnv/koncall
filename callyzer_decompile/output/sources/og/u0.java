package og;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j3.C3552f;
import java.io.IOException;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import md.C4715d;
import md.C4717f;
import org.xmlpull.v1.XmlPullParserException;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class u0 {
    /* renamed from: a */
    public static final C4715d m10939a(InterfaceC7564h interfaceC7564h) {
        AbstractC4154l.m8923f(interfaceC7564h, "<this>");
        C4717f c4717f = (C4717f) interfaceC7564h.o0(C4717f.f23609c);
        if (c4717f != null) {
            return c4717f.f23610b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final b4.C0595a m10940b(android.content.res.Resources.Theme r55, android.content.res.Resources r56, android.content.res.XmlResourceParser r57, int r58) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.u0.m10940b(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):b4.a");
    }

    /* renamed from: c */
    public static final C3552f m10941c(int i10, int i11, InterfaceC3962k interfaceC3962k) throws XmlPullParserException, Resources.NotFoundException, IOException {
        C3966o c3966o = (C3966o) interfaceC3962k;
        Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
        Resources resourcesM10885b = s0.m10885b(c3966o);
        Resources.Theme theme = context.getTheme();
        boolean zM8614g = ((((i11 & 112) ^ 48) > 32 && c3966o.m8612e(i10)) || (i11 & 48) == 32) | c3966o.m8614g(resourcesM10885b) | c3966o.m8614g(theme) | c3966o.m8614g(resourcesM10885b.getConfiguration());
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            TypedValue typedValue = new TypedValue();
            resourcesM10885b.getValue(i10, typedValue, true);
            XmlResourceParser xml = resourcesM10885b.getXml(i10);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            objM8596M = m10940b(theme, resourcesM10885b, xml, typedValue.changingConfigurations).f3970a;
            c3966o.j0(objM8596M);
        }
        return (C3552f) objM8596M;
    }
}
