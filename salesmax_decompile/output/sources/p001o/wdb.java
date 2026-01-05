package p001o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.AbstractC2193c;
import androidx.media3.exoplayer.InterfaceC2221p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class wdb extends AbstractC2193c implements Handler.Callback {

    /* renamed from: Y */
    public final hdb f51813Y;

    /* renamed from: Z */
    public final vdb f51814Z;
    public final Handler h0;
    public final mdb i0;
    public final boolean j0;
    public gdb k0;
    public boolean l0;
    public boolean m0;
    public long n0;
    public Metadata o0;
    public long p0;

    public wdb(vdb vdbVar, Looper looper) {
        this(vdbVar, looper, hdb.f26683a);
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    /* renamed from: Z */
    public void mo6887Z() {
        this.o0 = null;
        this.k0 = null;
        this.p0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: a */
    public int mo7449a(C2181a c2181a) {
        if (this.f51813Y.mo30258a(c2181a)) {
            return InterfaceC2221p.m7447s(c2181a.f7928K == 0 ? 4 : 2);
        }
        return InterfaceC2221p.m7447s(0);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: b */
    public boolean mo7429b() {
        return this.m0;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void c0(long j, boolean z) {
        this.o0 = null;
        this.l0 = false;
        this.m0 = false;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: g */
    public void mo7431g(long j, long j2) {
        boolean zR0 = true;
        while (zR0) {
            s0();
            zR0 = r0(j);
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o, androidx.media3.exoplayer.InterfaceC2221p
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        q0((Metadata) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void i0(C2181a[] c2181aArr, long j, long j2, x8b.C18076b c18076b) {
        this.k0 = this.f51813Y.mo30259b(c2181aArr[0]);
        Metadata metadata = this.o0;
        if (metadata != null) {
            this.o0 = metadata.m6695c((metadata.f7897b + this.p0) - j2);
        }
        this.p0 = j2;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public boolean isReady() {
        return true;
    }

    public final void n0(Metadata metadata, List list) {
        for (int i = 0; i < metadata.m6697e(); i++) {
            C2181a c2181aMo6698T = metadata.m6696d(i).mo6698T();
            if (c2181aMo6698T == null || !this.f51813Y.mo30258a(c2181aMo6698T)) {
                list.add(metadata.m6696d(i));
            } else {
                gdb gdbVarMo30259b = this.f51813Y.mo30259b(c2181aMo6698T);
                byte[] bArr = (byte[]) op0.m42515e(metadata.m6696d(i).g3());
                this.i0.mo16674h();
                this.i0.m16676v(bArr.length);
                ((ByteBuffer) sqi.m48729h(this.i0.f14282d)).put(bArr);
                this.i0.m16677w();
                Metadata metadataMo28502a = gdbVarMo30259b.mo28502a(this.i0);
                if (metadataMo28502a != null) {
                    n0(metadataMo28502a, list);
                }
            }
        }
    }

    public final long o0(long j) {
        op0.m42517g(j != -9223372036854775807L);
        op0.m42517g(this.p0 != -9223372036854775807L);
        return j - this.p0;
    }

    public final void p0(Metadata metadata) {
        Handler handler = this.h0;
        if (handler != null) {
            handler.obtainMessage(1, metadata).sendToTarget();
        } else {
            q0(metadata);
        }
    }

    public final void q0(Metadata metadata) {
        this.f51814Z.mo7193w(metadata);
    }

    public final boolean r0(long j) {
        boolean z;
        Metadata metadata = this.o0;
        if (metadata == null || (!this.j0 && metadata.f7897b > o0(j))) {
            z = false;
        } else {
            p0(this.o0);
            this.o0 = null;
            z = true;
        }
        if (this.l0 && this.o0 == null) {
            this.m0 = true;
        }
        return z;
    }

    public final void s0() {
        if (this.l0 || this.o0 != null) {
            return;
        }
        this.i0.mo16674h();
        if7 if7VarM6881T = m6881T();
        int iK0 = k0(if7VarM6881T, this.i0, 0);
        if (iK0 != -4) {
            if (iK0 == -5) {
                this.n0 = ((C2181a) op0.m42515e(if7VarM6881T.f28594b)).f7948s;
                return;
            }
            return;
        }
        if (this.i0.m50150n()) {
            this.l0 = true;
            return;
        }
        if (this.i0.f14284f >= m6883V()) {
            mdb mdbVar = this.i0;
            mdbVar.f35209s = this.n0;
            mdbVar.m16677w();
            Metadata metadataMo28502a = ((gdb) sqi.m48729h(this.k0)).mo28502a(this.i0);
            if (metadataMo28502a != null) {
                ArrayList arrayList = new ArrayList(metadataMo28502a.m6697e());
                n0(metadataMo28502a, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.o0 = new Metadata(o0(this.i0.f14284f), arrayList);
            }
        }
    }

    public wdb(vdb vdbVar, Looper looper, hdb hdbVar) {
        this(vdbVar, looper, hdbVar, false);
    }

    public wdb(vdb vdbVar, Looper looper, hdb hdbVar, boolean z) {
        super(5);
        this.f51814Z = (vdb) op0.m42515e(vdbVar);
        this.h0 = looper == null ? null : sqi.m48746y(looper, this);
        this.f51813Y = (hdb) op0.m42515e(hdbVar);
        this.j0 = z;
        this.i0 = new mdb();
        this.p0 = -9223372036854775807L;
    }
}
