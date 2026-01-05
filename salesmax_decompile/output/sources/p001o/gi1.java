package p001o;

import android.graphics.Bitmap;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.InterfaceC2221p;
import java.io.IOException;
import java.nio.ByteBuffer;
import p001o.ad8;

/* loaded from: classes2.dex */
public final class gi1 extends mtf implements ad8 {

    /* renamed from: o */
    public final InterfaceC13737b f25262o;

    /* renamed from: o.gi1$a */
    public class C13736a extends pd8 {
        public C13736a() {
        }

        @Override // p001o.b85
        /* renamed from: u */
        public void mo18274u() {
            gi1.this.m39675t(this);
        }
    }

    /* renamed from: o.gi1$b */
    public interface InterfaceC13737b {
        Bitmap decode(byte[] bArr, int i);
    }

    /* renamed from: o.gi1$c */
    public static final class C13738c implements ad8.InterfaceC12144a {

        /* renamed from: b */
        public final InterfaceC13737b f25264b = new InterfaceC13737b() { // from class: o.hi1
            @Override // p001o.gi1.InterfaceC13737b
            public final Bitmap decode(byte[] bArr, int i) {
                return gi1.m28776x(bArr, i);
            }
        };

        @Override // p001o.ad8.InterfaceC12144a
        /* renamed from: a */
        public int mo16898a(C2181a c2181a) {
            String str = c2181a.f7943n;
            return (str == null || !xeb.m56186n(str)) ? InterfaceC2221p.m7447s(0) : sqi.D0(c2181a.f7943n) ? InterfaceC2221p.m7447s(4) : InterfaceC2221p.m7447s(1);
        }

        @Override // p001o.ad8.InterfaceC12144a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public gi1 mo16899b() {
            return new gi1(this.f25264b, null);
        }
    }

    public /* synthetic */ gi1(InterfaceC13737b interfaceC13737b, C13736a c13736a) {
        this(interfaceC13737b);
    }

    /* renamed from: B */
    public static Bitmap m28775B(byte[] bArr, int i) throws bd8 {
        try {
            return qi1.m45507a(bArr, i, null);
        } catch (byc e) {
            throw new bd8("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new bd8(e2);
        }
    }

    /* renamed from: x */
    public static /* synthetic */ Bitmap m28776x(byte[] bArr, int i) {
        return m28775B(bArr, i);
    }

    @Override // p001o.mtf
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public bd8 mo28782k(Throwable th) {
        return new bd8("Unexpected decode error", th);
    }

    @Override // p001o.mtf
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public bd8 mo28783l(a85 a85Var, pd8 pd8Var, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) op0.m42515e(a85Var.f14282d);
            op0.m42517g(byteBuffer.hasArray());
            op0.m42511a(byteBuffer.arrayOffset() == 0);
            pd8Var.f39899e = this.f25262o.decode(byteBuffer.array(), byteBuffer.remaining());
            pd8Var.f15666b = a85Var.f14284f;
            return null;
        } catch (bd8 e) {
            return e;
        }
    }

    @Override // p001o.mtf, p001o.x75
    /* renamed from: a */
    public /* bridge */ /* synthetic */ pd8 mo16896a() {
        return (pd8) super.mo16896a();
    }

    @Override // p001o.mtf
    /* renamed from: i */
    public a85 mo28780i() {
        return new a85(1);
    }

    @Override // p001o.mtf
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public pd8 mo28781j() {
        return new C13736a();
    }

    public gi1(InterfaceC13737b interfaceC13737b) {
        super(new a85[1], new pd8[1]);
        this.f25262o = interfaceC13737b;
    }
}
