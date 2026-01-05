package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC2145n;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import p001o.n9c;
import p001o.z9b;
import p001o.zl7;

/* loaded from: classes2.dex */
public class LiveDataUtils {

    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1 */
    public class C26171 implements n9c {
        Out mCurrentOutput = null;
        final /* synthetic */ Object val$lock;
        final /* synthetic */ zl7 val$mappingMethod;
        final /* synthetic */ z9b val$outputLiveData;
        final /* synthetic */ TaskExecutor val$workTaskExecutor;

        public C26171(TaskExecutor taskExecutor, Object obj, zl7 zl7Var, z9b z9bVar) {
            this.val$workTaskExecutor = taskExecutor;
            this.val$lock = obj;
            this.val$mappingMethod = zl7Var;
            this.val$outputLiveData = z9bVar;
        }

        @Override // p001o.n9c
        public void onChanged(final In in) {
            this.val$workTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C26171.this.val$lock) {
                        ?? Apply = C26171.this.val$mappingMethod.apply(in);
                        C26171 c26171 = C26171.this;
                        Out out = c26171.mCurrentOutput;
                        if (out == 0 && Apply != 0) {
                            c26171.mCurrentOutput = Apply;
                            c26171.val$outputLiveData.postValue(Apply);
                        } else if (out != 0 && !out.equals(Apply)) {
                            C26171 c261712 = C26171.this;
                            c261712.mCurrentOutput = Apply;
                            c261712.val$outputLiveData.postValue(Apply);
                        }
                    }
                }
            });
        }
    }

    private LiveDataUtils() {
    }

    @SuppressLint({"LambdaLast"})
    public static <In, Out> AbstractC2145n dedupedMappedLiveDataFor(AbstractC2145n abstractC2145n, zl7 zl7Var, TaskExecutor taskExecutor) {
        Object obj = new Object();
        z9b z9bVar = new z9b();
        z9bVar.addSource(abstractC2145n, new C26171(taskExecutor, obj, zl7Var, z9bVar));
        return z9bVar;
    }
}
