package p001o;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import lombok.javac.Javac;

/* loaded from: classes6.dex */
public abstract class em1 {

    /* renamed from: a */
    public static final xg2 f21833a = new xg2(-1, null, null, 0);

    /* renamed from: b */
    public static final int f21834b = rig.m46848e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* renamed from: c */
    public static final int f21835c = rig.m46848e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", TransferRecord.MAXIMUM_UPLOAD_PARTS, 0, 0, 12, null);

    /* renamed from: d */
    public static final lgg f21836d = new lgg("BUFFERED");

    /* renamed from: e */
    public static final lgg f21837e = new lgg("SHOULD_BUFFER");

    /* renamed from: f */
    public static final lgg f21838f = new lgg("S_RESUMING_BY_RCV");

    /* renamed from: g */
    public static final lgg f21839g = new lgg("RESUMING_BY_EB");

    /* renamed from: h */
    public static final lgg f21840h = new lgg("POISONED");

    /* renamed from: i */
    public static final lgg f21841i = new lgg("DONE_RCV");

    /* renamed from: j */
    public static final lgg f21842j = new lgg("INTERRUPTED_SEND");

    /* renamed from: k */
    public static final lgg f21843k = new lgg("INTERRUPTED_RCV");

    /* renamed from: l */
    public static final lgg f21844l = new lgg("CHANNEL_CLOSED");

    /* renamed from: m */
    public static final lgg f21845m = new lgg("SUSPEND");

    /* renamed from: n */
    public static final lgg f21846n = new lgg("SUSPEND_NO_WAITER");

    /* renamed from: o */
    public static final lgg f21847o = new lgg("FAILED");

    /* renamed from: p */
    public static final lgg f21848p = new lgg("NO_RECEIVE_RESULT");

    /* renamed from: q */
    public static final lgg f21849q = new lgg("CLOSE_HANDLER_CLOSED");

    /* renamed from: r */
    public static final lgg f21850r = new lgg("CLOSE_HANDLER_INVOKED");

    /* renamed from: s */
    public static final lgg f21851s = new lgg("NO_CLOSE_CAUSE");

    /* renamed from: o.em1$a */
    public /* synthetic */ class C13216a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C13216a f21852a = new C13216a();

        public C13216a() {
            super(2, em1.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        /* renamed from: b */
        public final xg2 m25281b(long j, xg2 xg2Var) {
            return em1.m25278x(j, xg2Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m25281b(((Number) obj).longValue(), (xg2) obj2);
        }
    }

    /* renamed from: A */
    public static final long m25252A(int i) {
        if (i == 0) {
            return 0L;
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: B */
    public static final boolean m25253B(xb2 xb2Var, Object obj, ql7 ql7Var) {
        Object objMo48693p = xb2Var.mo48693p(obj, null, ql7Var);
        if (objMo48693p == null) {
            return false;
        }
        xb2Var.mo48686F(objMo48693p);
        return true;
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m25254C(xb2 xb2Var, Object obj, ql7 ql7Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            ql7Var = null;
        }
        return m25253B(xb2Var, obj, ql7Var);
    }

    /* renamed from: v */
    public static final long m25276v(long j, boolean z) {
        return (z ? Javac.SEALED : 0L) + j;
    }

    /* renamed from: w */
    public static final long m25277w(long j, int i) {
        return (i << 60) + j;
    }

    /* renamed from: x */
    public static final xg2 m25278x(long j, xg2 xg2Var) {
        return new xg2(j, xg2Var, xg2Var.m56242y(), 0);
    }

    /* renamed from: y */
    public static final rb9 m25279y() {
        return C13216a.f21852a;
    }

    /* renamed from: z */
    public static final lgg m25280z() {
        return f21844l;
    }
}
