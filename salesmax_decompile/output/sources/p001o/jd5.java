package p001o;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p001o.dz4;
import p001o.je5;

/* loaded from: classes2.dex */
public final class jd5 implements dz4 {

    /* renamed from: a */
    public final Context f30190a;

    /* renamed from: b */
    public final List f30191b = new ArrayList();

    /* renamed from: c */
    public final dz4 f30192c;

    /* renamed from: d */
    public dz4 f30193d;

    /* renamed from: e */
    public dz4 f30194e;

    /* renamed from: f */
    public dz4 f30195f;

    /* renamed from: g */
    public dz4 f30196g;

    /* renamed from: h */
    public dz4 f30197h;

    /* renamed from: i */
    public dz4 f30198i;

    /* renamed from: j */
    public dz4 f30199j;

    /* renamed from: k */
    public dz4 f30200k;

    /* renamed from: o.jd5$a */
    public static final class C14503a implements dz4.InterfaceC13064a {

        /* renamed from: a */
        public final Context f30201a;

        /* renamed from: b */
        public final dz4.InterfaceC13064a f30202b;

        /* renamed from: c */
        public juh f30203c;

        public C14503a(Context context) {
            this(context, new je5.C14508b());
        }

        @Override // p001o.dz4.InterfaceC13064a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public jd5 mo23962a() {
            jd5 jd5Var = new jd5(this.f30201a, this.f30202b.mo23962a());
            juh juhVar = this.f30203c;
            if (juhVar != null) {
                jd5Var.mo23961j(juhVar);
            }
            return jd5Var;
        }

        public C14503a(Context context, dz4.InterfaceC13064a interfaceC13064a) {
            this.f30201a = context.getApplicationContext();
            this.f30202b = interfaceC13064a;
        }
    }

    public jd5(Context context, dz4 dz4Var) {
        this.f30190a = context.getApplicationContext();
        this.f30192c = (dz4) op0.m42515e(dz4Var);
    }

    @Override // p001o.dz4
    /* renamed from: b */
    public Map mo23959b() {
        dz4 dz4Var = this.f30200k;
        return dz4Var == null ? Collections.emptyMap() : dz4Var.mo23959b();
    }

    @Override // p001o.dz4
    public void close() {
        dz4 dz4Var = this.f30200k;
        if (dz4Var != null) {
            try {
                dz4Var.close();
            } finally {
                this.f30200k = null;
            }
        }
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) {
        op0.m42517g(this.f30200k == null);
        String scheme = iz4Var.f29380a.getScheme();
        if (sqi.I0(iz4Var.f29380a)) {
            String path = iz4Var.f29380a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f30200k = m33559r();
            } else {
                this.f30200k = m33556o();
            }
        } else if ("asset".equals(scheme)) {
            this.f30200k = m33556o();
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            this.f30200k = m33557p();
        } else if ("rtmp".equals(scheme)) {
            this.f30200k = m33561t();
        } else if ("udp".equals(scheme)) {
            this.f30200k = m33562u();
        } else if (Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(scheme)) {
            this.f30200k = m33558q();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f30200k = m33560s();
        } else {
            this.f30200k = this.f30192c;
        }
        return this.f30200k.mo23960e(iz4Var);
    }

    @Override // p001o.dz4
    public Uri getUri() {
        dz4 dz4Var = this.f30200k;
        if (dz4Var == null) {
            return null;
        }
        return dz4Var.getUri();
    }

    @Override // p001o.dz4
    /* renamed from: j */
    public void mo23961j(juh juhVar) {
        op0.m42515e(juhVar);
        this.f30192c.mo23961j(juhVar);
        this.f30191b.add(juhVar);
        m33563v(this.f30193d, juhVar);
        m33563v(this.f30194e, juhVar);
        m33563v(this.f30195f, juhVar);
        m33563v(this.f30196g, juhVar);
        m33563v(this.f30197h, juhVar);
        m33563v(this.f30198i, juhVar);
        m33563v(this.f30199j, juhVar);
    }

    /* renamed from: n */
    public final void m33555n(dz4 dz4Var) {
        for (int i = 0; i < this.f30191b.size(); i++) {
            dz4Var.mo23961j((juh) this.f30191b.get(i));
        }
    }

    /* renamed from: o */
    public final dz4 m33556o() {
        if (this.f30194e == null) {
            pp0 pp0Var = new pp0(this.f30190a);
            this.f30194e = pp0Var;
            m33555n(pp0Var);
        }
        return this.f30194e;
    }

    /* renamed from: p */
    public final dz4 m33557p() {
        if (this.f30195f == null) {
            v14 v14Var = new v14(this.f30190a);
            this.f30195f = v14Var;
            m33555n(v14Var);
        }
        return this.f30195f;
    }

    /* renamed from: q */
    public final dz4 m33558q() {
        if (this.f30198i == null) {
            qu4 qu4Var = new qu4();
            this.f30198i = qu4Var;
            m33555n(qu4Var);
        }
        return this.f30198i;
    }

    /* renamed from: r */
    public final dz4 m33559r() {
        if (this.f30193d == null) {
            ru6 ru6Var = new ru6();
            this.f30193d = ru6Var;
            m33555n(ru6Var);
        }
        return this.f30193d;
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) {
        return ((dz4) op0.m42515e(this.f30200k)).read(bArr, i, i2);
    }

    /* renamed from: s */
    public final dz4 m33560s() {
        if (this.f30199j == null) {
            ice iceVar = new ice(this.f30190a);
            this.f30199j = iceVar;
            m33555n(iceVar);
        }
        return this.f30199j;
    }

    /* renamed from: t */
    public final dz4 m33561t() {
        if (this.f30196g == null) {
            try {
                dz4 dz4Var = (dz4) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f30196g = dz4Var;
                m33555n(dz4Var);
            } catch (ClassNotFoundException unused) {
                ria.m46824h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f30196g == null) {
                this.f30196g = this.f30192c;
            }
        }
        return this.f30196g;
    }

    /* renamed from: u */
    public final dz4 m33562u() {
        if (this.f30197h == null) {
            v1i v1iVar = new v1i();
            this.f30197h = v1iVar;
            m33555n(v1iVar);
        }
        return this.f30197h;
    }

    /* renamed from: v */
    public final void m33563v(dz4 dz4Var, juh juhVar) {
        if (dz4Var != null) {
            dz4Var.mo23961j(juhVar);
        }
    }
}
