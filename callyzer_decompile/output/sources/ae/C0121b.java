package ae;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import b00.AbstractC0517b;
import ge.C2580l;
import java.io.IOException;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import org.xmlpull.v1.XmlPullParserException;
import pg.k9;
import pg.s8;
import q8.AbstractC6142a;
import rw.AbstractC6663m;
import t5.AbstractC7052j;
import uw.InterfaceC7559c;
import yd.C8618a;
import yd.C8634q;
import yd.C8635r;
import yd.EnumC8622e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ae.b */
/* loaded from: classes.dex */
public final class C0121b implements InterfaceC0127h {

    /* renamed from: a */
    public final /* synthetic */ int f399a;

    /* renamed from: b */
    public final Uri f400b;

    /* renamed from: c */
    public final C2580l f401c;

    public /* synthetic */ C0121b(Uri uri, C2580l c2580l, int i10) {
        this.f399a = i10;
        this.f400b = uri;
        this.f401c = c2580l;
    }

    @Override // ae.InterfaceC0127h
    /* renamed from: a */
    public final Object mo300a(InterfaceC7559c interfaceC7559c) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Integer numM10140v;
        Drawable drawable;
        int i10 = this.f399a;
        Uri uri = this.f400b;
        C2580l c2580l = this.f401c;
        switch (i10) {
            case 0:
                String strM12748L = AbstractC6663m.m12748L(AbstractC6663m.m12738B(uri.getPathSegments()), "/", null, null, null, 62);
                return new C0133n(new C8635r(AbstractC0517b.m1524c(AbstractC0517b.m1529h(c2580l.f14045a.getAssets().open(strM12748L))), new C8618a()), AbstractC4066g.m8841b(MimeTypeMap.getSingleton(), strM12748L), EnumC8622e.DISK);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (AbstractC5178p.m10101L(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) AbstractC6663m.m12751O(uri.getPathSegments());
                        if (str == null || (numM10140v = AbstractC5185w.m10140v(str)) == null) {
                            throw new IllegalStateException("Invalid android.resource URI: " + uri);
                        }
                        int iIntValue = numM10140v.intValue();
                        Context context = c2580l.f14045a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        boolean z6 = true;
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strM8841b = AbstractC4066g.m8841b(MimeTypeMap.getSingleton(), charSequence.subSequence(AbstractC5178p.m10103N(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!AbstractC4154l.m8918a(strM8841b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new C0133n(new C8635r(AbstractC0517b.m1524c(AbstractC0517b.m1529h(resources.openRawResource(iIntValue, typedValue2))), new C8634q(typedValue2.density)), strM8841b, EnumC8622e.DISK);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = s8.m11864b(context, iIntValue);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC4801l.m9730d(iIntValue, "Invalid resource ID: ").toString());
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = AbstractC7052j.f34088a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC4801l.m9730d(iIntValue, "Invalid resource ID: ").toString());
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof AbstractC6142a)) {
                            z6 = false;
                        }
                        if (z6) {
                            drawable = new BitmapDrawable(context.getResources(), k9.m11735b(drawable, c2580l.f14046b, c2580l.f14048d, c2580l.f14049e, c2580l.f14050f));
                        }
                        return new C0124e(drawable, z6, EnumC8622e.DISK);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + uri);
        }
    }
}
