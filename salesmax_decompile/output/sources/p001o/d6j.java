package p001o;

/* loaded from: classes6.dex */
public abstract class d6j {
    public void onClosed(b6j b6jVar, int i, String str) {
        sq8.m48649h(b6jVar, "webSocket");
        sq8.m48649h(str, "reason");
    }

    public void onClosing(b6j b6jVar, int i, String str) {
        sq8.m48649h(b6jVar, "webSocket");
        sq8.m48649h(str, "reason");
    }

    public void onFailure(b6j b6jVar, Throwable th, zqe zqeVar) {
        sq8.m48649h(b6jVar, "webSocket");
        sq8.m48649h(th, "t");
    }

    public void onMessage(b6j b6jVar, String str) {
        sq8.m48649h(b6jVar, "webSocket");
        sq8.m48649h(str, "text");
    }

    public void onOpen(b6j b6jVar, zqe zqeVar) {
        sq8.m48649h(b6jVar, "webSocket");
        sq8.m48649h(zqeVar, "response");
    }

    public void onMessage(b6j b6jVar, zq1 zq1Var) {
        sq8.m48649h(b6jVar, "webSocket");
        sq8.m48649h(zq1Var, "bytes");
    }
}
