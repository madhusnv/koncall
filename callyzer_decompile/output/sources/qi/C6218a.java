package qi;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC4154l;
import og.fd;
import zv.C9098b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.a */
/* loaded from: classes.dex */
public final class C6218a {

    /* renamed from: a */
    public String f30206a;

    /* renamed from: b */
    public int f30207b;

    /* renamed from: c */
    public int f30208c;

    /* renamed from: d */
    public Serializable f30209d;

    /* renamed from: e */
    public final Object f30210e;

    /* renamed from: f */
    public final Object f30211f;

    /* renamed from: g */
    public Object f30212g;

    public C6218a() {
        this.f30206a = "Callyzer-Biz";
        this.f30209d = "Callyzer-Biz";
        this.f30207b = 3;
        long[] jArr = new long[5];
        for (int i10 = 0; i10 < 5; i10++) {
            jArr[i10] = 1000;
        }
        this.f30210e = jArr;
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        AbstractC4154l.m8922e(defaultUri, "getDefaultUri(...)");
        this.f30211f = defaultUri;
        this.f30212g = new AudioAttributes.Builder().setUsage(5).setContentType(2).build();
        this.f30208c = 1;
    }

    /* renamed from: a */
    public void m12227a(C6228k c6228k) {
        if (((HashSet) this.f30209d).contains(c6228k.f30238a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f30210e).add(c6228k);
    }

    /* renamed from: b */
    public C6219b m12228b() {
        if (((InterfaceC6222e) this.f30212g) != null) {
            return new C6219b(this.f30206a, new HashSet((HashSet) this.f30209d), new HashSet((HashSet) this.f30210e), this.f30207b, this.f30208c, (InterfaceC6222e) this.f30212g, (HashSet) this.f30211f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    /* renamed from: c */
    public C9098b m12229c(Context context) {
        AbstractC4154l.m8923f(context, "context");
        C9098b c9098b = new C9098b(context);
        C9098b.m16508a(c9098b, (String) this.f30209d, this.f30206a, this.f30207b, (Uri) this.f30211f, (AudioAttributes) this.f30212g, (long[]) this.f30210e, this.f30208c);
        return c9098b;
    }

    /* renamed from: d */
    public void m12230d(int i10) {
        if (!(this.f30207b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f30207b = i10;
    }

    public C6218a(Class cls, Class[] clsArr) {
        this.f30206a = null;
        HashSet hashSet = new HashSet();
        this.f30209d = hashSet;
        this.f30210e = new HashSet();
        this.f30207b = 0;
        this.f30208c = 0;
        this.f30211f = new HashSet();
        hashSet.add(C6234q.m12250a(cls));
        for (Class cls2 : clsArr) {
            fd.m10650a(cls2, "Null interface");
            ((HashSet) this.f30209d).add(C6234q.m12250a(cls2));
        }
    }

    public C6218a(C6234q c6234q, C6234q[] c6234qArr) {
        this.f30206a = null;
        HashSet hashSet = new HashSet();
        this.f30209d = hashSet;
        this.f30210e = new HashSet();
        this.f30207b = 0;
        this.f30208c = 0;
        this.f30211f = new HashSet();
        hashSet.add(c6234q);
        for (C6234q c6234q2 : c6234qArr) {
            fd.m10650a(c6234q2, "Null interface");
        }
        Collections.addAll((HashSet) this.f30209d, c6234qArr);
    }
}
