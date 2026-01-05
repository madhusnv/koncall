package p001o;

import android.content.Context;

/* loaded from: classes2.dex */
public interface d9i {

    /* renamed from: a */
    public static final d9i f19443a = new C12847a();

    /* renamed from: o.d9i$a */
    public class C12847a implements d9i {
        @Override // p001o.d9i
        /* renamed from: a */
        public mq3 mo22642a(EnumC12848b enumC12848b, int i) {
            return null;
        }
    }

    /* renamed from: o.d9i$b */
    public enum EnumC12848b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* renamed from: o.d9i$c */
    public interface InterfaceC12849c {
        /* renamed from: a */
        d9i mo16535a(Context context);
    }

    /* renamed from: a */
    mq3 mo22642a(EnumC12848b enumC12848b, int i);
}
