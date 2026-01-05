package p001o;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import lombok.javac.Javac;
import org.apache.http.HttpHeaders;
import org.apache.http.message.TokenParser;
import p001o.f6j;
import p001o.zq1;

/* loaded from: classes6.dex */
public final class dee implements b6j, f6j.InterfaceC13351a {

    /* renamed from: A */
    public static final C12888b f19673A = new C12888b(null);

    /* renamed from: B */
    public static final List f19674B = bh3.m18963e(a2e.HTTP_1_1);

    /* renamed from: a */
    public final ule f19675a;

    /* renamed from: b */
    public final d6j f19676b;

    /* renamed from: c */
    public final Random f19677c;

    /* renamed from: d */
    public final long f19678d;

    /* renamed from: e */
    public c6j f19679e;

    /* renamed from: f */
    public long f19680f;

    /* renamed from: g */
    public final long f19681g;

    /* renamed from: h */
    public final String f19682h;

    /* renamed from: i */
    public bt1 f19683i;

    /* renamed from: j */
    public wjg f19684j;

    /* renamed from: k */
    public f6j f19685k;

    /* renamed from: l */
    public g6j f19686l;

    /* renamed from: m */
    public tog f19687m;

    /* renamed from: n */
    public String f19688n;

    /* renamed from: o */
    public AbstractC12890d f19689o;

    /* renamed from: p */
    public final ArrayDeque f19690p;

    /* renamed from: q */
    public final ArrayDeque f19691q;

    /* renamed from: r */
    public long f19692r;

    /* renamed from: s */
    public boolean f19693s;

    /* renamed from: t */
    public int f19694t;

    /* renamed from: u */
    public String f19695u;

    /* renamed from: v */
    public boolean f19696v;

    /* renamed from: w */
    public int f19697w;

    /* renamed from: x */
    public int f19698x;

    /* renamed from: y */
    public int f19699y;

    /* renamed from: z */
    public boolean f19700z;

    /* renamed from: o.dee$a */
    public static final class C12887a {

        /* renamed from: a */
        public final int f19701a;

        /* renamed from: b */
        public final zq1 f19702b;

        /* renamed from: c */
        public final long f19703c;

        public C12887a(int i, zq1 zq1Var, long j) {
            this.f19701a = i;
            this.f19702b = zq1Var;
            this.f19703c = j;
        }

        /* renamed from: a */
        public final long m22935a() {
            return this.f19703c;
        }

        /* renamed from: b */
        public final int m22936b() {
            return this.f19701a;
        }

        /* renamed from: c */
        public final zq1 m22937c() {
            return this.f19702b;
        }
    }

    /* renamed from: o.dee$b */
    public static final class C12888b {
        public C12888b() {
        }

        public /* synthetic */ C12888b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.dee$c */
    public static final class C12889c {

        /* renamed from: a */
        public final int f19704a;

        /* renamed from: b */
        public final zq1 f19705b;

        public C12889c(int i, zq1 zq1Var) {
            sq8.m48649h(zq1Var, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f19704a = i;
            this.f19705b = zq1Var;
        }

        /* renamed from: a */
        public final zq1 m22938a() {
            return this.f19705b;
        }

        /* renamed from: b */
        public final int m22939b() {
            return this.f19704a;
        }
    }

    /* renamed from: o.dee$d */
    public static abstract class AbstractC12890d implements Closeable {

        /* renamed from: a */
        public final boolean f19706a;

        /* renamed from: b */
        public final im1 f19707b;

        /* renamed from: c */
        public final gm1 f19708c;

        public AbstractC12890d(boolean z, im1 im1Var, gm1 gm1Var) {
            sq8.m48649h(im1Var, "source");
            sq8.m48649h(gm1Var, "sink");
            this.f19706a = z;
            this.f19707b = im1Var;
            this.f19708c = gm1Var;
        }

        /* renamed from: a */
        public abstract void mo22940a();

        /* renamed from: c */
        public final boolean m22941c() {
            return this.f19706a;
        }

        /* renamed from: d */
        public final gm1 m22942d() {
            return this.f19708c;
        }

        /* renamed from: f */
        public final im1 m22943f() {
            return this.f19707b;
        }
    }

    /* renamed from: o.dee$e */
    public final class C12891e extends wjg {
        public C12891e() {
            super(dee.this.f19688n + " writer", false, 2, null);
        }

        @Override // p001o.wjg
        /* renamed from: f */
        public long mo16932f() throws IOException {
            try {
                return dee.this.m22933x() ? 0L : -1L;
            } catch (IOException e) {
                dee.m22917q(dee.this, e, null, true, 2, null);
                return -1L;
            }
        }
    }

    /* renamed from: o.dee$f */
    public static final class C12892f implements z22 {

        /* renamed from: b */
        public final /* synthetic */ ule f19711b;

        public C12892f(ule uleVar) {
            this.f19711b = uleVar;
        }

        @Override // p001o.z22
        public void onFailure(bt1 bt1Var, IOException iOException) throws IOException {
            sq8.m48649h(bt1Var, "call");
            sq8.m48649h(iOException, "e");
            dee.m22917q(dee.this, iOException, null, false, 6, null);
        }

        @Override // p001o.z22
        public void onResponse(bt1 bt1Var, zqe zqeVar) throws IOException {
            sq8.m48649h(bt1Var, "call");
            sq8.m48649h(zqeVar, "response");
            dl6 dl6VarM59740k = zqeVar.m59740k();
            try {
                dee.this.m22923m(zqeVar, dl6VarM59740k);
                sq8.m48646e(dl6VarM59740k);
                AbstractC12890d abstractC12890dM23399n = dl6VarM59740k.m23399n();
                c6j c6jVarM20351a = c6j.f17419g.m20351a(zqeVar.m59744u());
                dee.this.f19679e = c6jVarM20351a;
                if (!dee.this.m22929t(c6jVarM20351a)) {
                    dee deeVar = dee.this;
                    synchronized (deeVar) {
                        deeVar.f19691q.clear();
                        deeVar.mo18204f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                dee.this.m22928s(jgj.f30422f + " WebSocket " + this.f19711b.m51741l().m53884p(), abstractC12890dM23399n);
                dee.this.m22930u(zqeVar);
            } catch (IOException e) {
                dee.m22917q(dee.this, e, zqeVar, false, 4, null);
                ggj.m28626f(zqeVar);
                if (dl6VarM59740k != null) {
                    dl6VarM59740k.m23408w();
                }
            }
        }
    }

    /* renamed from: o.dee$g */
    public static final class C12893g extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ gge f19712a;

        /* renamed from: b */
        public final /* synthetic */ gge f19713b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12893g(gge ggeVar, gge ggeVar2) {
            super(0);
            this.f19712a = ggeVar;
            this.f19713b = ggeVar2;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() throws IOException {
            m68989invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68989invoke() throws IOException {
            ggj.m28626f((Closeable) this.f19712a.f25106a);
            AbstractC12890d abstractC12890d = (AbstractC12890d) this.f19713b.f25106a;
            if (abstractC12890d != null) {
                ggj.m28626f(abstractC12890d);
            }
        }
    }

    /* renamed from: o.dee$h */
    public static final class C12894h extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ g6j f19714a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12894h(g6j g6jVar) {
            super(0);
            this.f19714a = g6jVar;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() throws IOException {
            m68990invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68990invoke() throws IOException {
            ggj.m28626f(this.f19714a);
        }
    }

    /* renamed from: o.dee$i */
    public static final class C12895i extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ long f19716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12895i(long j) {
            super(0);
            this.f19716b = j;
        }

        @Override // p001o.uk7
        public final Long invoke() throws IOException {
            dee.this.m22934y();
            return Long.valueOf(this.f19716b);
        }
    }

    /* renamed from: o.dee$j */
    public static final class C12896j extends kf9 implements uk7 {
        public C12896j() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68991invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68991invoke() {
            dee.this.cancel();
        }
    }

    public dee(uog uogVar, ule uleVar, d6j d6jVar, Random random, long j, c6j c6jVar, long j2, long j3) {
        sq8.m48649h(uogVar, "taskRunner");
        sq8.m48649h(uleVar, "originalRequest");
        sq8.m48649h(d6jVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        sq8.m48649h(random, "random");
        this.f19675a = uleVar;
        this.f19676b = d6jVar;
        this.f19677c = random;
        this.f19678d = j;
        this.f19679e = c6jVar;
        this.f19680f = j2;
        this.f19681g = j3;
        this.f19687m = uogVar.m51859k();
        this.f19690p = new ArrayDeque();
        this.f19691q = new ArrayDeque();
        this.f19694t = -1;
        if (!sq8.m48644c("GET", uleVar.m51737h())) {
            throw new IllegalArgumentException(("Request must be GET: " + uleVar.m51737h()).toString());
        }
        zq1.C18692a c18692a = zq1.f57497d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        y3i y3iVar = y3i.f54824a;
        this.f19682h = zq1.C18692a.m59704f(c18692a, bArr, 0, 0, 3, null).mo38694a();
    }

    /* renamed from: q */
    public static /* synthetic */ void m22917q(dee deeVar, Exception exc, zqe zqeVar, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            zqeVar = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        deeVar.m22926p(exc, zqeVar, z);
    }

    @Override // p001o.f6j.InterfaceC13351a
    /* renamed from: a */
    public synchronized void mo22918a(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "payload");
        this.f19699y++;
        this.f19700z = false;
    }

    @Override // p001o.b6j
    /* renamed from: b */
    public boolean mo18202b(String str) {
        sq8.m48649h(str, "text");
        return m22932w(zq1.f57497d.m59707c(str), 1);
    }

    @Override // p001o.f6j.InterfaceC13351a
    /* renamed from: c */
    public void mo22919c(String str) {
        sq8.m48649h(str, "text");
        this.f19676b.onMessage(this, str);
    }

    @Override // p001o.b6j
    public void cancel() {
        bt1 bt1Var = this.f19683i;
        sq8.m48646e(bt1Var);
        bt1Var.cancel();
    }

    @Override // p001o.f6j.InterfaceC13351a
    /* renamed from: d */
    public synchronized void mo22920d(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "payload");
        if (!this.f19696v && (!this.f19693s || !this.f19691q.isEmpty())) {
            this.f19690p.add(zq1Var);
            m22931v();
            this.f19698x++;
        }
    }

    @Override // p001o.b6j
    /* renamed from: e */
    public boolean mo18203e(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "bytes");
        return m22932w(zq1Var, 2);
    }

    @Override // p001o.b6j
    /* renamed from: f */
    public boolean mo18204f(int i, String str) {
        return m22924n(i, str, this.f19681g);
    }

    @Override // p001o.f6j.InterfaceC13351a
    /* renamed from: g */
    public void mo22921g(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "bytes");
        this.f19676b.onMessage(this, zq1Var);
    }

    @Override // p001o.f6j.InterfaceC13351a
    /* renamed from: h */
    public void mo22922h(int i, String str) {
        sq8.m48649h(str, "reason");
        boolean z = true;
        if (!(i != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.f19694t != -1) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("already closed".toString());
            }
            this.f19694t = i;
            this.f19695u = str;
            y3i y3iVar = y3i.f54824a;
        }
        this.f19676b.onClosing(this, i, str);
    }

    /* renamed from: m */
    public final void m22923m(zqe zqeVar, dl6 dl6Var) throws ProtocolException {
        sq8.m48649h(zqeVar, "response");
        if (zqeVar.m59739h() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + zqeVar.m59739h() + TokenParser.SP + zqeVar.m59726C() + '\'');
        }
        String strM59725t = zqe.m59725t(zqeVar, "Connection", null, 2, null);
        if (!e9g.m24606x(HttpHeaders.UPGRADE, strM59725t, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strM59725t + '\'');
        }
        String strM59725t2 = zqe.m59725t(zqeVar, HttpHeaders.UPGRADE, null, 2, null);
        if (!e9g.m24606x("websocket", strM59725t2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strM59725t2 + '\'');
        }
        String strM59725t3 = zqe.m59725t(zqeVar, "Sec-WebSocket-Accept", null, 2, null);
        String strMo38694a = zq1.f57497d.m59707c(this.f19682h + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").m59692I().mo38694a();
        if (sq8.m48644c(strMo38694a, strM59725t3)) {
            if (dl6Var == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo38694a + "' but was '" + strM59725t3 + '\'');
    }

    /* renamed from: n */
    public final synchronized boolean m22924n(int i, String str, long j) {
        zq1 zq1VarM59707c;
        e6j.f21070a.m24423c(i);
        if (str != null) {
            zq1VarM59707c = zq1.f57497d.m59707c(str);
            if (!(((long) zq1VarM59707c.m59694L()) <= 123)) {
                throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
            }
        } else {
            zq1VarM59707c = null;
        }
        if (!this.f19696v && !this.f19693s) {
            this.f19693s = true;
            this.f19691q.add(new C12887a(i, zq1VarM59707c, j));
            m22931v();
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void m22925o(hac hacVar) {
        sq8.m48649h(hacVar, "client");
        if (this.f19675a.m51734e("Sec-WebSocket-Extensions") != null) {
            m22917q(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        hac hacVarM30116c = hacVar.m30051A().m30123j(dk6.NONE).m30108U(f19674B).m30116c();
        ule uleVarM51746b = this.f19675a.m51738i().m51757n(HttpHeaders.UPGRADE, "websocket").m51757n("Connection", HttpHeaders.UPGRADE).m51757n("Sec-WebSocket-Key", this.f19682h).m51757n("Sec-WebSocket-Version", "13").m51757n("Sec-WebSocket-Extensions", "permessage-deflate").m51746b();
        yce yceVar = new yce(hacVarM30116c, uleVarM51746b, true);
        this.f19683i = yceVar;
        sq8.m48646e(yceVar);
        yceVar.v1(new C12892f(uleVarM51746b));
    }

    /* renamed from: p */
    public final void m22926p(Exception exc, zqe zqeVar, boolean z) throws IOException {
        sq8.m48649h(exc, "e");
        gge ggeVar = new gge();
        gge ggeVar2 = new gge();
        synchronized (this) {
            if (this.f19696v) {
                return;
            }
            this.f19696v = true;
            AbstractC12890d abstractC12890d = this.f19689o;
            g6j g6jVar = this.f19686l;
            ggeVar2.f25106a = g6jVar;
            AbstractC12890d abstractC12890d2 = null;
            this.f19686l = null;
            if (g6jVar != null && this.f19685k == null) {
                abstractC12890d2 = abstractC12890d;
            }
            ggeVar.f25106a = abstractC12890d2;
            if (!z && ggeVar2.f25106a != null) {
                tog.m50260d(this.f19687m, this.f19688n + " writer close", 0L, false, new C12893g(ggeVar2, ggeVar), 2, null);
            }
            this.f19687m.m50276q();
            y3i y3iVar = y3i.f54824a;
            try {
                this.f19676b.onFailure(this, exc, zqeVar);
            } finally {
                if (abstractC12890d != null) {
                    abstractC12890d.mo22940a();
                }
                if (z) {
                    g6j g6jVar2 = (g6j) ggeVar2.f25106a;
                    if (g6jVar2 != null) {
                        ggj.m28626f(g6jVar2);
                    }
                    AbstractC12890d abstractC12890d3 = (AbstractC12890d) ggeVar.f25106a;
                    if (abstractC12890d3 != null) {
                        ggj.m28626f(abstractC12890d3);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final void m22927r() throws IOException {
        boolean z;
        int i;
        String str;
        f6j f6jVar;
        AbstractC12890d abstractC12890d;
        synchronized (this) {
            z = this.f19696v;
            i = this.f19694t;
            str = this.f19695u;
            f6jVar = this.f19685k;
            this.f19685k = null;
            if (this.f19693s && this.f19691q.isEmpty()) {
                g6j g6jVar = this.f19686l;
                if (g6jVar != null) {
                    this.f19686l = null;
                    tog.m50260d(this.f19687m, this.f19688n + " writer close", 0L, false, new C12894h(g6jVar), 2, null);
                }
                this.f19687m.m50276q();
            }
            abstractC12890d = this.f19686l == null ? this.f19689o : null;
            y3i y3iVar = y3i.f54824a;
        }
        if (!z && abstractC12890d != null && this.f19694t != -1) {
            d6j d6jVar = this.f19676b;
            sq8.m48646e(str);
            d6jVar.onClosed(this, i, str);
        }
        if (f6jVar != null) {
            ggj.m28626f(f6jVar);
        }
        if (abstractC12890d != null) {
            ggj.m28626f(abstractC12890d);
        }
    }

    /* renamed from: s */
    public final void m22928s(String str, AbstractC12890d abstractC12890d) {
        sq8.m48649h(str, "name");
        sq8.m48649h(abstractC12890d, "streams");
        c6j c6jVar = this.f19679e;
        sq8.m48646e(c6jVar);
        synchronized (this) {
            this.f19688n = str;
            this.f19689o = abstractC12890d;
            this.f19686l = new g6j(abstractC12890d.m22941c(), abstractC12890d.m22942d(), this.f19677c, c6jVar.f17420a, c6jVar.m20350a(abstractC12890d.m22941c()), this.f19680f);
            this.f19684j = new C12891e();
            long j = this.f19678d;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                this.f19687m.m50271k(str + " ping", nanos, new C12895i(nanos));
            }
            if (!this.f19691q.isEmpty()) {
                m22931v();
            }
            y3i y3iVar = y3i.f54824a;
        }
        this.f19685k = new f6j(abstractC12890d.m22941c(), abstractC12890d.m22943f(), this, c6jVar.f17420a, c6jVar.m20350a(!abstractC12890d.m22941c()));
    }

    /* renamed from: t */
    public final boolean m22929t(c6j c6jVar) {
        if (!c6jVar.f17425f && c6jVar.f17421b == null) {
            return c6jVar.f17423d == null || new kl8(8, 15).m35829r(c6jVar.f17423d.intValue());
        }
        return false;
    }

    /* renamed from: u */
    public final void m22930u(zqe zqeVar) throws IOException {
        sq8.m48649h(zqeVar, "response");
        try {
            try {
                this.f19676b.onOpen(this, zqeVar);
                while (this.f19694t == -1) {
                    f6j f6jVar = this.f19685k;
                    sq8.m48646e(f6jVar);
                    f6jVar.m26217a();
                }
            } catch (Exception e) {
                m22917q(this, e, null, false, 6, null);
            }
        } finally {
            m22927r();
        }
    }

    /* renamed from: v */
    public final void m22931v() {
        if (!jgj.f30421e || Thread.holdsLock(this)) {
            wjg wjgVar = this.f19684j;
            if (wjgVar != null) {
                tog.m50261m(this.f19687m, wjgVar, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* renamed from: w */
    public final synchronized boolean m22932w(zq1 zq1Var, int i) {
        if (!this.f19696v && !this.f19693s) {
            if (this.f19692r + zq1Var.m59694L() > Javac.GENERATED_MEMBER) {
                mo18204f(1001, null);
                return false;
            }
            this.f19692r += zq1Var.m59694L();
            this.f19691q.add(new C12889c(i, zq1Var));
            m22931v();
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[Catch: all -> 0x00e4, TRY_ENTER, TryCatch #2 {all -> 0x00e4, blocks: (B:32:0x0083, B:33:0x008c, B:35:0x0090, B:36:0x00a0, B:38:0x00af, B:41:0x00b2, B:42:0x00b3, B:43:0x00b4, B:45:0x00b8, B:47:0x00ca, B:54:0x00de, B:55:0x00e3, B:37:0x00a1), top: B:69:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x00e4, TryCatch #2 {all -> 0x00e4, blocks: (B:32:0x0083, B:33:0x008c, B:35:0x0090, B:36:0x00a0, B:38:0x00af, B:41:0x00b2, B:42:0x00b3, B:43:0x00b4, B:45:0x00b8, B:47:0x00ca, B:54:0x00de, B:55:0x00e3, B:37:0x00a1), top: B:69:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m22933x() throws IOException {
        AbstractC12890d abstractC12890d;
        String str;
        int i;
        ?? r5;
        synchronized (this) {
            if (this.f19696v) {
                return false;
            }
            g6j g6jVar = this.f19686l;
            Object objPoll = this.f19690p.poll();
            Object obj = null;
            abstractC12890d = null;
            AbstractC12890d abstractC12890d2 = null;
            try {
                if (objPoll == null) {
                    Object objPoll2 = this.f19691q.poll();
                    if (objPoll2 instanceof C12887a) {
                        int i2 = this.f19694t;
                        str = this.f19695u;
                        if (i2 != -1) {
                            g6j g6jVar2 = this.f19686l;
                            this.f19686l = null;
                            if (g6jVar2 != null && this.f19685k == null) {
                                abstractC12890d2 = this.f19689o;
                            }
                            this.f19687m.m50276q();
                            i = i2;
                            abstractC12890d = abstractC12890d2;
                            obj = objPoll2;
                            r5 = g6jVar2;
                        } else {
                            long jM22935a = ((C12887a) objPoll2).m22935a();
                            tog.m50260d(this.f19687m, this.f19688n + " cancel", TimeUnit.MILLISECONDS.toNanos(jM22935a), false, new C12896j(), 4, null);
                            r5 = 0;
                            obj = objPoll2;
                            i = i2;
                            abstractC12890d = null;
                        }
                        y3i y3iVar = y3i.f54824a;
                        if (objPoll == null) {
                            sq8.m48646e(g6jVar);
                            g6jVar.m28110g((zq1) objPoll);
                        } else if (obj instanceof C12889c) {
                            C12889c c12889c = (C12889c) obj;
                            sq8.m48646e(g6jVar);
                            g6jVar.m28108d(c12889c.m22939b(), c12889c.m22938a());
                            synchronized (this) {
                                this.f19692r -= c12889c.m22938a().m59694L();
                            }
                        } else {
                            if (!(obj instanceof C12887a)) {
                                throw new AssertionError();
                            }
                            C12887a c12887a = (C12887a) obj;
                            sq8.m48646e(g6jVar);
                            g6jVar.m28106a(c12887a.m22936b(), c12887a.m22937c());
                            if (abstractC12890d != null) {
                                d6j d6jVar = this.f19676b;
                                sq8.m48646e(str);
                                d6jVar.onClosed(this, i, str);
                            }
                        }
                    }
                    if (objPoll2 == null) {
                        return false;
                    }
                    abstractC12890d = null;
                    str = null;
                    obj = objPoll2;
                } else {
                    abstractC12890d = null;
                    str = null;
                }
                if (objPoll == null) {
                }
            } finally {
                if (r5 != 0) {
                    ggj.m28626f(r5);
                }
                if (abstractC12890d != null) {
                    ggj.m28626f(abstractC12890d);
                }
            }
            i = -1;
            r5 = str;
            y3i y3iVar2 = y3i.f54824a;
        }
    }

    /* renamed from: y */
    public final void m22934y() throws IOException {
        synchronized (this) {
            if (this.f19696v) {
                return;
            }
            g6j g6jVar = this.f19686l;
            if (g6jVar == null) {
                return;
            }
            int i = this.f19700z ? this.f19697w : -1;
            this.f19697w++;
            this.f19700z = true;
            y3i y3iVar = y3i.f54824a;
            if (i == -1) {
                try {
                    g6jVar.m28109f(zq1.f57498e);
                    return;
                } catch (IOException e) {
                    m22917q(this, e, null, true, 2, null);
                    return;
                }
            }
            m22917q(this, new SocketTimeoutException("sent ping but didn't receive pong within " + this.f19678d + "ms (after " + (i - 1) + " successful ping/pongs)"), null, true, 2, null);
        }
    }
}
