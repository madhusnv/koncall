package p001o;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class ct3 {

    /* renamed from: a */
    public final ade f18602a;

    /* renamed from: o.ct3$a */
    public static final class C12740a extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ uog f18603a;

        /* renamed from: b */
        public final /* synthetic */ int f18604b;

        /* renamed from: c */
        public final /* synthetic */ int f18605c;

        /* renamed from: d */
        public final /* synthetic */ int f18606d;

        /* renamed from: e */
        public final /* synthetic */ int f18607e;

        /* renamed from: f */
        public final /* synthetic */ int f18608f;

        /* renamed from: g */
        public final /* synthetic */ boolean f18609g;

        /* renamed from: h */
        public final /* synthetic */ boolean f18610h;

        /* renamed from: q */
        public final /* synthetic */ dve f18611q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12740a(uog uogVar, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, dve dveVar) {
            super(3);
            this.f18603a = uogVar;
            this.f18604b = i;
            this.f18605c = i2;
            this.f18606d = i3;
            this.f18607e = i4;
            this.f18608f = i5;
            this.f18609g = z;
            this.f18610h = z2;
            this.f18611q = dveVar;
        }

        @Override // p001o.ql7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fl6 invoke(ade adeVar, d60 d60Var, gt3 gt3Var) {
            sq8.m48649h(adeVar, "pool");
            sq8.m48649h(d60Var, "address");
            sq8.m48649h(gt3Var, "user");
            return new ys6(new hc7(new ede(this.f18603a, adeVar, this.f18604b, this.f18605c, this.f18606d, this.f18607e, this.f18608f, this.f18609g, this.f18610h, d60Var, this.f18611q, gt3Var)), this.f18603a);
        }
    }

    public ct3(ade adeVar) {
        sq8.m48649h(adeVar, "delegate");
        this.f18602a = adeVar;
    }

    /* renamed from: a */
    public final int m21740a() {
        return this.f18602a.m16922d();
    }

    /* renamed from: b */
    public final void m21741b() {
        this.f18602a.m16923e();
    }

    /* renamed from: c */
    public final ade m21742c() {
        return this.f18602a;
    }

    /* renamed from: d */
    public final int m21743d() {
        return this.f18602a.m16925g();
    }

    public /* synthetic */ ct3(int i, long j, TimeUnit timeUnit, uog uogVar, bt3 bt3Var, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, dve dveVar, int i7, id5 id5Var) {
        this((i7 & 1) != 0 ? 5 : i, (i7 & 2) != 0 ? 5L : j, (i7 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i7 & 8) != 0 ? uog.f49285m : uogVar, (i7 & 16) != 0 ? bt3.f16779a.m19709a() : bt3Var, (i7 & 32) != 0 ? 10000 : i2, (i7 & 64) != 0 ? 10000 : i3, (i7 & 128) != 0 ? 10000 : i4, (i7 & 256) != 0 ? 10000 : i5, (i7 & 512) == 0 ? i6 : TransferRecord.MAXIMUM_UPLOAD_PARTS, (i7 & 1024) != 0 ? true : z, (i7 & 2048) == 0 ? z2 : true, (i7 & 4096) != 0 ? new dve() : dveVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ct3(int i, long j, TimeUnit timeUnit, uog uogVar, bt3 bt3Var, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, dve dveVar) {
        this(new ade(uogVar, i, j, timeUnit, bt3Var, new C12740a(uogVar, i2, i3, i4, i5, i6, z, z2, dveVar)));
        sq8.m48649h(timeUnit, "timeUnit");
        sq8.m48649h(uogVar, "taskRunner");
        sq8.m48649h(bt3Var, "connectionListener");
        sq8.m48649h(dveVar, "routeDatabase");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ct3(int i, long j, TimeUnit timeUnit, bt3 bt3Var) {
        this(i, j, timeUnit, uog.f49285m, bt3Var, 0, 0, 0, 0, 0, false, false, null, 8160, null);
        sq8.m48649h(timeUnit, "timeUnit");
        sq8.m48649h(bt3Var, "connectionListener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ct3(int i, long j, TimeUnit timeUnit) {
        this(i, j, timeUnit, uog.f49285m, bt3.f16779a.m19709a(), 0, 0, 0, 0, 0, false, false, null, 8160, null);
        sq8.m48649h(timeUnit, "timeUnit");
    }
}
