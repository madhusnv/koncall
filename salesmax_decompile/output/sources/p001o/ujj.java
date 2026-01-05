package p001o;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class ujj implements Runnable {

    /* renamed from: a */
    public final TaskCompletionSource f49006a;

    public ujj() {
        this.f49006a = null;
    }

    /* renamed from: a */
    public abstract void mo19307a();

    /* renamed from: b */
    public final TaskCompletionSource m51662b() {
        return this.f49006a;
    }

    /* renamed from: c */
    public final void m51663c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f49006a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo19307a();
        } catch (Exception e) {
            m51663c(e);
        }
    }

    public ujj(TaskCompletionSource taskCompletionSource) {
        this.f49006a = taskCompletionSource;
    }
}
