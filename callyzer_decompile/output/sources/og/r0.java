package og;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import b4.C0595a;
import b4.C0596b;
import b4.C0597c;
import b4.C0598d;
import d3.C1552f;
import e1.C1922x;
import i3.AbstractC3166c;
import i3.C3164a;
import j3.AbstractC3548b;
import java.lang.ref.WeakReference;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r0 {
    /* renamed from: a */
    public static mb.l2 m10865a(String str) {
        return str.equals("requester") ? mb.j2.f23262b : new mb.k2(str);
    }

    /* renamed from: b */
    public static final AbstractC3166c m10866b(int i10, int i11, InterfaceC3962k interfaceC3962k) {
        TypedValue typedValue;
        boolean z6;
        C3966o c3966o = (C3966o) interfaceC3962k;
        Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
        c3966o.m8618k(AndroidCompositionLocals_androidKt.f2133a);
        Resources resources = context.getResources();
        C0598d c0598d = (C0598d) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2136d);
        synchronized (c0598d) {
            typedValue = (TypedValue) c0598d.f3975a.m5595b(i10);
            z6 = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                C1922x c1922x = c0598d.f3975a;
                int iM5659d = c1922x.m5659d(i10);
                Object[] objArr = c1922x.f9012c;
                Object obj = objArr[iM5659d];
                c1922x.f9011b[iM5659d] = i10;
                objArr[iM5659d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && AbstractC5178p.m10092C(charSequence, ".xml")) {
            c3966o.m8607Y(-803043333);
            Resources.Theme theme = context.getTheme();
            int i12 = typedValue.changingConfigurations;
            C0597c c0597c = (C0597c) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2135c);
            C0596b c0596b = new C0596b(theme, i10);
            WeakReference weakReference = (WeakReference) c0597c.f3974a.get(c0596b);
            C0595a c0595aM10940b = weakReference != null ? (C0595a) weakReference.get() : null;
            if (c0595aM10940b == null) {
                XmlResourceParser xml = resources.getXml(i10);
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!AbstractC4154l.m8918a(xml.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                c0595aM10940b = u0.m10940b(theme, resources, xml, i12);
                c0597c.f3974a.put(c0596b, new WeakReference(c0595aM10940b));
            }
            j3.j0 j0VarM8081c = AbstractC3548b.m8081c(c0595aM10940b.f3970a, c3966o);
            c3966o.m8623p(false);
            return j0VarM8081c;
        }
        c3966o.m8607Y(-802887899);
        Resources.Theme theme2 = context.getTheme();
        boolean zM8614g = c3966o.m8614g(charSequence);
        if ((((i11 & 14) ^ 6) <= 4 || !c3966o.m8612e(i10)) && (i11 & 6) != 4) {
            z6 = false;
        }
        boolean zM8614g2 = zM8614g | z6 | c3966o.m8614g(theme2);
        Object objM8596M = c3966o.m8596M();
        if (zM8614g2 || objM8596M == C3961j.f20408a) {
            try {
                Drawable drawable = resources.getDrawable(i10, null);
                AbstractC4154l.m8921d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                objM8596M = new C1552f(((BitmapDrawable) drawable).getBitmap());
                c3966o.j0(objM8596M);
            } catch (Exception e2) {
                throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e2);
            }
        }
        C3164a c3164a = new C3164a((C1552f) objM8596M, (r0.f7745a.getWidth() << 32) | (r0.f7745a.getHeight() & 4294967295L));
        c3966o.m8623p(false);
        return c3164a;
    }
}
