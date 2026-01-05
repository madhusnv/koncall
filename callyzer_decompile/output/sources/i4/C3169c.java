package i4;

import java.text.BreakIterator;
import pg.x5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i4.c */
/* loaded from: classes.dex */
public final class C3169c extends x5 {

    /* renamed from: a */
    public final BreakIterator f17097a;

    public C3169c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f17097a = characterInstance;
    }

    @Override // pg.x5
    /* renamed from: c */
    public final int mo7537c(int i10) {
        return this.f17097a.following(i10);
    }

    @Override // pg.x5
    /* renamed from: e */
    public final int mo7538e(int i10) {
        return this.f17097a.preceding(i10);
    }
}
