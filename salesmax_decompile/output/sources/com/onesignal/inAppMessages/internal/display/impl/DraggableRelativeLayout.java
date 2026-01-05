package com.onesignal.inAppMessages.internal.display.impl;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.onesignal.common.ViewUtils;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import p001o.fwi;
import p001o.id5;
import p001o.sq8;
import p001o.wvi;

/* loaded from: classes6.dex */
public final class DraggableRelativeLayout extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;
    private fwi mDragHelper;
    private DraggableListener mListener;
    private Params params;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public interface DraggableListener {
        void onDismiss();

        void onDragEnd();

        void onDragStart();
    }

    public static final class Params {
        public static final Companion Companion = new Companion(null);
        public static final int DRAGGABLE_DIRECTION_DOWN = 1;
        public static final int DRAGGABLE_DIRECTION_UP = 0;
        private int dismissingYPos;
        private int dismissingYVelocity;
        private int dragDirection;
        private int dragThresholdY;
        private boolean draggingDisabled;
        private int height;
        private int maxXPos;
        private int maxYPos;
        private int messageHeight;
        private int offScreenYPos;
        private int posY;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }
        }

        public final int getDismissingYPos() {
            return this.dismissingYPos;
        }

        public final int getDismissingYVelocity() {
            return this.dismissingYVelocity;
        }

        public final int getDragDirection() {
            return this.dragDirection;
        }

        public final int getDragThresholdY() {
            return this.dragThresholdY;
        }

        public final boolean getDraggingDisabled() {
            return this.draggingDisabled;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxXPos() {
            return this.maxXPos;
        }

        public final int getMaxYPos() {
            return this.maxYPos;
        }

        public final int getMessageHeight() {
            return this.messageHeight;
        }

        public final int getOffScreenYPos() {
            return this.offScreenYPos;
        }

        public final int getPosY() {
            return this.posY;
        }

        public final void setDismissingYPos(int i) {
            this.dismissingYPos = i;
        }

        public final void setDismissingYVelocity(int i) {
            this.dismissingYVelocity = i;
        }

        public final void setDragDirection(int i) {
            this.dragDirection = i;
        }

        public final void setDragThresholdY(int i) {
            this.dragThresholdY = i;
        }

        public final void setDraggingDisabled(boolean z) {
            this.draggingDisabled = z;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setMaxXPos(int i) {
            this.maxXPos = i;
        }

        public final void setMaxYPos(int i) {
            this.maxYPos = i;
        }

        public final void setMessageHeight(int i) {
            this.messageHeight = i;
        }

        public final void setOffScreenYPos(int i) {
            this.offScreenYPos = i;
        }

        public final void setPosY(int i) {
            this.posY = i;
        }
    }

    static {
        ViewUtils viewUtils = ViewUtils.INSTANCE;
        MARGIN_PX_SIZE = viewUtils.dpToPx(28);
        EXTRA_PX_DISMISS = viewUtils.dpToPx(64);
    }

    public DraggableRelativeLayout(Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    private final void createDragHelper() {
        this.mDragHelper = fwi.m27664o(this, 1.0f, new fwi.AbstractC13588c() { // from class: com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.createDragHelper.1
            private int lastYPos;

            @Override // p001o.fwi.AbstractC13588c
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                sq8.m48649h(view, "child");
                Params params = DraggableRelativeLayout.this.params;
                sq8.m48646e(params);
                return params.getMaxXPos();
            }

            @Override // p001o.fwi.AbstractC13588c
            public int clampViewPositionVertical(View view, int i, int i2) {
                sq8.m48649h(view, "child");
                Params params = DraggableRelativeLayout.this.params;
                sq8.m48646e(params);
                if (params.getDraggingDisabled()) {
                    Params params2 = DraggableRelativeLayout.this.params;
                    sq8.m48646e(params2);
                    return params2.getMaxYPos();
                }
                this.lastYPos = i;
                Params params3 = DraggableRelativeLayout.this.params;
                sq8.m48646e(params3);
                if (params3.getDragDirection() == 1) {
                    Params params4 = DraggableRelativeLayout.this.params;
                    sq8.m48646e(params4);
                    if (i >= params4.getDragThresholdY() && DraggableRelativeLayout.this.mListener != null) {
                        DraggableListener draggableListener = DraggableRelativeLayout.this.mListener;
                        sq8.m48646e(draggableListener);
                        draggableListener.onDragStart();
                    }
                    Params params5 = DraggableRelativeLayout.this.params;
                    sq8.m48646e(params5);
                    if (i < params5.getMaxYPos()) {
                        Params params6 = DraggableRelativeLayout.this.params;
                        sq8.m48646e(params6);
                        return params6.getMaxYPos();
                    }
                } else {
                    Params params7 = DraggableRelativeLayout.this.params;
                    sq8.m48646e(params7);
                    if (i <= params7.getDragThresholdY() && DraggableRelativeLayout.this.mListener != null) {
                        DraggableListener draggableListener2 = DraggableRelativeLayout.this.mListener;
                        sq8.m48646e(draggableListener2);
                        draggableListener2.onDragStart();
                    }
                    Params params8 = DraggableRelativeLayout.this.params;
                    sq8.m48646e(params8);
                    if (i > params8.getMaxYPos()) {
                        Params params9 = DraggableRelativeLayout.this.params;
                        sq8.m48646e(params9);
                        return params9.getMaxYPos();
                    }
                }
                return i;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
            @Override // p001o.fwi.AbstractC13588c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onViewReleased(View view, float f, float f2) {
                sq8.m48649h(view, "releasedChild");
                Params params = DraggableRelativeLayout.this.params;
                sq8.m48646e(params);
                int maxYPos = params.getMaxYPos();
                if (!DraggableRelativeLayout.this.dismissing) {
                    Params params2 = DraggableRelativeLayout.this.params;
                    sq8.m48646e(params2);
                    if (params2.getDragDirection() == 1) {
                        int i = this.lastYPos;
                        Params params3 = DraggableRelativeLayout.this.params;
                        sq8.m48646e(params3);
                        if (i <= params3.getDismissingYPos()) {
                            sq8.m48646e(DraggableRelativeLayout.this.params);
                            if (f2 > r4.getDismissingYVelocity()) {
                                Params params4 = DraggableRelativeLayout.this.params;
                                sq8.m48646e(params4);
                                maxYPos = params4.getOffScreenYPos();
                                DraggableRelativeLayout.this.dismissing = true;
                                if (DraggableRelativeLayout.this.mListener != null) {
                                    DraggableListener draggableListener = DraggableRelativeLayout.this.mListener;
                                    sq8.m48646e(draggableListener);
                                    draggableListener.onDismiss();
                                }
                            }
                        }
                    } else {
                        int i2 = this.lastYPos;
                        Params params5 = DraggableRelativeLayout.this.params;
                        sq8.m48646e(params5);
                        if (i2 >= params5.getDismissingYPos()) {
                            sq8.m48646e(DraggableRelativeLayout.this.params);
                            if (f2 < r4.getDismissingYVelocity()) {
                                Params params6 = DraggableRelativeLayout.this.params;
                                sq8.m48646e(params6);
                                maxYPos = params6.getOffScreenYPos();
                                DraggableRelativeLayout.this.dismissing = true;
                                if (DraggableRelativeLayout.this.mListener != null) {
                                    DraggableListener draggableListener2 = DraggableRelativeLayout.this.mListener;
                                    sq8.m48646e(draggableListener2);
                                    draggableListener2.onDismiss();
                                }
                            }
                        }
                    }
                }
                fwi fwiVar = DraggableRelativeLayout.this.mDragHelper;
                sq8.m48646e(fwiVar);
                Params params7 = DraggableRelativeLayout.this.params;
                sq8.m48646e(params7);
                if (fwiVar.m27681P(params7.getMaxXPos(), maxYPos)) {
                    wvi.d0(DraggableRelativeLayout.this);
                }
            }

            @Override // p001o.fwi.AbstractC13588c
            public boolean tryCaptureView(View view, int i) {
                sq8.m48649h(view, "child");
                return true;
            }
        });
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        fwi fwiVar = this.mDragHelper;
        sq8.m48646e(fwiVar);
        if (fwiVar.m27698n(true)) {
            wvi.d0(this);
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        fwi fwiVar = this.mDragHelper;
        sq8.m48646e(fwiVar);
        int left = getLeft();
        Params params = this.params;
        sq8.m48646e(params);
        fwiVar.m27683R(this, left, params.getOffScreenYPos());
        wvi.d0(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        DraggableListener draggableListener;
        sq8.m48649h(motionEvent, "event");
        if (this.dismissing) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (draggableListener = this.mListener) != null) {
            sq8.m48646e(draggableListener);
            draggableListener.onDragEnd();
        }
        fwi fwiVar = this.mDragHelper;
        sq8.m48646e(fwiVar);
        fwiVar.m27672G(motionEvent);
        return false;
    }

    public final void setListener(DraggableListener draggableListener) {
        this.mListener = draggableListener;
    }

    public final void setParams(Params params) {
        sq8.m48649h(params, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        this.params = params;
        params.setOffScreenYPos(params.getMessageHeight() + params.getPosY() + ((Resources.getSystem().getDisplayMetrics().heightPixels - params.getMessageHeight()) - params.getPosY()) + EXTRA_PX_DISMISS);
        params.setDismissingYVelocity(ViewUtils.INSTANCE.dpToPx(3000));
        if (params.getDragDirection() != 0) {
            params.setDismissingYPos((params.getMessageHeight() / 3) + (params.getMaxYPos() * 2));
            return;
        }
        params.setOffScreenYPos((-params.getMessageHeight()) - MARGIN_PX_SIZE);
        params.setDismissingYVelocity(-params.getDismissingYVelocity());
        params.setDismissingYPos(params.getOffScreenYPos() / 3);
    }
}
