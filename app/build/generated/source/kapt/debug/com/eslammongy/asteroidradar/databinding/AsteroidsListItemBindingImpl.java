package com.eslammongy.asteroidradar.databinding;
import com.eslammongy.asteroidradar.R;
import com.eslammongy.asteroidradar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AsteroidsListItemBindingImpl extends AsteroidsListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AsteroidsListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private AsteroidsListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            );
        this.asteroidDate.setTag(null);
        this.asteroidName.setTag(null);
        this.asteroidStatusIcon.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.asteroid == variableId) {
            setAsteroid((com.eslammongy.asteroidradar.domain.Asteroid) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAsteroid(@Nullable com.eslammongy.asteroidradar.domain.Asteroid Asteroid) {
        this.mAsteroid = Asteroid;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.asteroid);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.eslammongy.asteroidradar.domain.Asteroid asteroid = mAsteroid;
        boolean asteroidPotentiallyHazardous = false;
        java.lang.String asteroidCloseApproachDate = null;
        java.lang.String asteroidCodename = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (asteroid != null) {
                    // read asteroid.potentiallyHazardous
                    asteroidPotentiallyHazardous = asteroid.isPotentiallyHazardous();
                    // read asteroid.closeApproachDate
                    asteroidCloseApproachDate = asteroid.getCloseApproachDate();
                    // read asteroid.codename
                    asteroidCodename = asteroid.getCodename();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.asteroidDate, asteroidCloseApproachDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.asteroidName, asteroidCodename);
            com.eslammongy.asteroidradar.adapter.BindingAdaptersKt.bindAsteroidStatusImage(this.asteroidStatusIcon, asteroidPotentiallyHazardous);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): asteroid
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}