package p001o;

import com.bumptech.glide.load.data.InterfaceC10732a;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class eq1 implements InterfaceC10732a {

    /* renamed from: a */
    public final ByteBuffer f22037a;

    /* renamed from: o.eq1$a */
    public static class C13245a implements InterfaceC10732a.a {
        @Override // com.bumptech.glide.load.data.InterfaceC10732a.a
        /* renamed from: a */
        public Class mo12703a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC10732a.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC10732a mo12704b(ByteBuffer byteBuffer) {
            return new eq1(byteBuffer);
        }
    }

    public eq1(ByteBuffer byteBuffer) {
        this.f22037a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC10732a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo12701c() {
        this.f22037a.position(0);
        return this.f22037a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC10732a
    /* renamed from: b */
    public void mo12700b() {
    }
}
