package p001o;

import com.google.firebase.encoders.proto.ProtobufEncoder;

/* loaded from: classes5.dex */
public abstract class s1e {

    /* renamed from: a */
    public static final ProtobufEncoder f44435a = ProtobufEncoder.builder().configureWith(q31.f41183a).build();

    /* renamed from: a */
    public static byte[] m47449a(Object obj) {
        return f44435a.encode(obj);
    }
}
