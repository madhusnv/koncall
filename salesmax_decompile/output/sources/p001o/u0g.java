package p001o;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class u0g extends ntf {

    /* renamed from: a */
    public final zwc f48147a = new zwc();

    /* renamed from: b */
    public final ywc f48148b = new ywc();

    /* renamed from: c */
    public umh f48149c;

    @Override // p001o.ntf
    /* renamed from: b */
    public Metadata mo33901b(mdb mdbVar, ByteBuffer byteBuffer) {
        umh umhVar = this.f48149c;
        if (umhVar == null || mdbVar.f35209s != umhVar.m51799f()) {
            umh umhVar2 = new umh(mdbVar.f14284f);
            this.f48149c = umhVar2;
            umhVar2.m51794a(mdbVar.f14284f - mdbVar.f35209s);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f48147a.m60015S(bArrArray, iLimit);
        this.f48148b.m58451o(bArrArray, iLimit);
        this.f48148b.m58454r(39);
        long jM58444h = (this.f48148b.m58444h(1) << 32) | this.f48148b.m58444h(32);
        this.f48148b.m58454r(20);
        int iM58444h = this.f48148b.m58444h(12);
        int iM58444h2 = this.f48148b.m58444h(8);
        this.f48147a.m60018V(14);
        Metadata.Entry entryM7604a = iM58444h2 != 0 ? iM58444h2 != 255 ? iM58444h2 != 4 ? iM58444h2 != 5 ? iM58444h2 != 6 ? null : TimeSignalCommand.m7604a(this.f48147a, jM58444h, this.f48149c) : SpliceInsertCommand.m7584a(this.f48147a, jM58444h, this.f48149c) : SpliceScheduleCommand.m7591a(this.f48147a) : PrivateCommand.m7581a(this.f48147a, iM58444h, jM58444h) : new SpliceNullCommand();
        return entryM7604a == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entryM7604a);
    }
}
