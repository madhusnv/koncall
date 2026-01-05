package p001o;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public abstract class wga {
    Context mContext;
    int mId;
    InterfaceC17847b mListener;
    InterfaceC17846a mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    /* renamed from: o.wga$a */
    public interface InterfaceC17846a {
    }

    /* renamed from: o.wga$b */
    public interface InterfaceC17847b {
        /* renamed from: a */
        void mo19003a(wga wgaVar, Object obj);
    }

    public wga(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        p75.m43084a(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(Object obj) {
        InterfaceC17847b interfaceC17847b = this.mListener;
        if (interfaceC17847b != null) {
            interfaceC17847b.mo19003a(this, obj);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public abstract boolean onCancelLoad();

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public void onForceLoad() {
    }

    public void onReset() {
    }

    public abstract void onStartLoading();

    public void onStopLoading() {
    }

    public void registerListener(int i, InterfaceC17847b interfaceC17847b) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = interfaceC17847b;
        this.mId = i;
    }

    public void registerOnLoadCanceledListener(InterfaceC17846a interfaceC17846a) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        p75.m43084a(this, sb);
        sb.append(" id=");
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }

    public void unregisterListener(InterfaceC17847b interfaceC17847b) {
        InterfaceC17847b interfaceC17847b2 = this.mListener;
        if (interfaceC17847b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC17847b2 != interfaceC17847b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    public void unregisterOnLoadCanceledListener(InterfaceC17846a interfaceC17846a) {
        throw new IllegalStateException("No listener register");
    }
}
