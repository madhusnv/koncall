package p001o;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jk6 extends ntf {
    @Override // p001o.ntf
    /* renamed from: b */
    public Metadata mo33901b(mdb mdbVar, ByteBuffer byteBuffer) {
        return new Metadata(m33902c(new zwc(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public EventMessage m33902c(zwc zwcVar) {
        return new EventMessage((String) op0.m42515e(zwcVar.m59998B()), (String) op0.m42515e(zwcVar.m59998B()), zwcVar.m59997A(), zwcVar.m59997A(), Arrays.copyOfRange(zwcVar.m60024e(), zwcVar.m60025f(), zwcVar.m60026g()));
    }
}
