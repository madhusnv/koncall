package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ya4 {

    /* renamed from: a */
    public final Map f55135a = new LinkedHashMap();

    /* renamed from: o.ya4$a */
    public static final class C18361a extends ya4 {

        /* renamed from: b */
        public static final C18361a f55136b = new C18361a();

        @Override // p001o.ya4
        /* renamed from: a */
        public Object mo54752a(InterfaceC18362b interfaceC18362b) {
            sq8.m48649h(interfaceC18362b, TransferTable.COLUMN_KEY);
            return null;
        }
    }

    /* renamed from: o.ya4$b */
    public interface InterfaceC18362b {
    }

    /* renamed from: a */
    public abstract Object mo54752a(InterfaceC18362b interfaceC18362b);

    /* renamed from: b */
    public final Map m57412b() {
        return this.f55135a;
    }
}
