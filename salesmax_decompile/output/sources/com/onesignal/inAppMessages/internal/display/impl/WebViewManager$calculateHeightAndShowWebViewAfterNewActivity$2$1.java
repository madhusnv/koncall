package com.onesignal.inAppMessages.internal.display.impl;

import p001o.jgg;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

@l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1", m36648f = "WebViewManager.kt", m36649l = {238}, m36650m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1 extends jgg implements xk7 {
    final /* synthetic */ int $pagePxHeight;
    int label;
    final /* synthetic */ WebViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1(WebViewManager webViewManager, int i, n64 n64Var) {
        super(1, n64Var);
        this.this$0 = webViewManager;
        this.$pagePxHeight = i;
    }

    @Override // p001o.vb1
    public final n64 create(n64 n64Var) {
        return new WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1(this.this$0, this.$pagePxHeight, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            WebViewManager webViewManager = this.this$0;
            Integer numM39304d = ml1.m39304d(this.$pagePxHeight);
            this.label = 1;
            if (webViewManager.showMessageView(numM39304d, this) == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        return y3i.f54824a;
    }

    @Override // p001o.xk7
    public final Object invoke(n64 n64Var) {
        return ((WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1) create(n64Var)).invokeSuspend(y3i.f54824a);
    }
}
