package q7;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import l7.AbstractC4422v;
import l7.C4419s;
import l7.C4421u;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q7.g */
/* loaded from: classes.dex */
public final class C6140g {

    /* renamed from: a */
    public final AbstractC4422v f29935a;

    /* renamed from: b */
    public String f29936b;

    /* renamed from: c */
    public final ArrayList f29937c = new ArrayList();

    /* renamed from: d */
    public final LinkedHashMap f29938d = new LinkedHashMap();

    /* renamed from: e */
    public int f29939e;

    /* renamed from: f */
    public String f29940f;

    /* renamed from: g */
    public C6366p f29941g;

    public C6140g(AbstractC4422v abstractC4422v) {
        this.f29935a = abstractC4422v;
    }

    /* renamed from: a */
    public final C4421u m12189a(String route) {
        C4419s c4419s;
        AbstractC4154l.m8923f(route, "route");
        C6366p c6366p = this.f29941g;
        if (c6366p == null || (c4419s = (C4419s) c6366p.getValue()) == null) {
            return null;
        }
        int i10 = AbstractC4422v.f22133f;
        String uriString = "android-app://androidx.navigation/".concat(route);
        AbstractC4154l.m8923f(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        AbstractC4154l.m8922e(uri, "parse(...)");
        Bundle bundleM9241d = c4419s.m9241d(uri, this.f29938d);
        if (bundleM9241d == null) {
            return null;
        }
        return new C4421u(this.f29935a, bundleM9241d, c4419s.f22124p, c4419s.m9239b(uri), false, -1);
    }
}
