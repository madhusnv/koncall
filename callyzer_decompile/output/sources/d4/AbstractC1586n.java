package d4;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import ex.InterfaceC2139c;
import java.util.concurrent.atomic.AtomicInteger;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.n */
/* loaded from: classes.dex */
public abstract class AbstractC1586n {

    /* renamed from: a */
    public static final AtomicInteger f7872a = new AtomicInteger(0);

    /* renamed from: a */
    public static final InterfaceC7879r m5203a(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new ClearAndSetSemanticsElement(interfaceC2139c));
    }

    /* renamed from: b */
    public static final InterfaceC7879r m5204b(InterfaceC7879r interfaceC7879r, boolean z6, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new AppendedSemanticsElement(interfaceC2139c, z6));
    }
}
