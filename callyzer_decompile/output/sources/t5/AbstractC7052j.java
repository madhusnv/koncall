package t5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import e1.C1917s;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import qi.RunnableC6224g;
import u5.AbstractC7341c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t5.j */
/* loaded from: classes.dex */
public abstract class AbstractC7052j {

    /* renamed from: a */
    public static final ThreadLocal f34088a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f34089b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f34090c = new Object();

    /* renamed from: a */
    public static Typeface m13343a(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m13344b(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* renamed from: b */
    public static Typeface m13344b(Context context, int i10, TypedValue typedValue, int i11, AbstractC7044b abstractC7044b, boolean z6, boolean z10) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM13739a = null;
        if (string.startsWith("res/")) {
            int i12 = typedValue.assetCookie;
            C1917s c1917s = AbstractC7341c.f34962b;
            Typeface typeface = (Typeface) c1917s.m5620h(AbstractC7341c.m13740b(resources, i10, string, i12, i11));
            if (typeface != null) {
                if (abstractC7044b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC6224g(5, abstractC7044b, typeface));
                }
                typefaceM13739a = typeface;
            } else if (!z10) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC7046d interfaceC7046dM13336i = AbstractC7044b.m13336i(resources.getXml(i10), resources);
                        if (interfaceC7046dM13336i != null) {
                            typefaceM13739a = AbstractC7341c.m13739a(context, interfaceC7046dM13336i, resources, i10, string, typedValue.assetCookie, i11, abstractC7044b, z6);
                        } else if (abstractC7044b != null) {
                            abstractC7044b.m13340a(-3);
                        }
                    } else {
                        int i13 = typedValue.assetCookie;
                        Typeface typefaceMo11903e = AbstractC7341c.f34961a.mo11903e(context, resources, i10, string, i11);
                        if (typefaceMo11903e != null) {
                            c1917s.m5624l(AbstractC7341c.m13740b(resources, i10, string, i13, i11), typefaceMo11903e);
                        }
                        if (abstractC7044b != null) {
                            if (typefaceMo11903e != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC6224g(5, abstractC7044b, typefaceMo11903e));
                            } else {
                                abstractC7044b.m13340a(-3);
                            }
                        }
                        typefaceM13739a = typefaceMo11903e;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (abstractC7044b != null) {
                        abstractC7044b.m13340a(-3);
                    }
                }
            }
        } else if (abstractC7044b != null) {
            abstractC7044b.m13340a(-3);
        }
        if (typefaceM13739a != null || abstractC7044b != null || z10) {
            return typefaceM13739a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }
}
