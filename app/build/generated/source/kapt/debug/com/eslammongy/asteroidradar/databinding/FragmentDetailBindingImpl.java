package com.eslammongy.asteroidradar.databinding;
import com.eslammongy.asteroidradar.R;
import com.eslammongy.asteroidradar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailBindingImpl extends FragmentDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.help_button, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[5]
            );
        this.absoluteMagnitude.setTag(null);
        this.activityMainImageOfTheDay.setTag(null);
        this.closeApproachDate.setTag(null);
        this.distanceFromEarth.setTag(null);
        this.estimatedDiameter.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.relativeVelocity.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.eslammongy.asteroidradar.ui.detail.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.eslammongy.asteroidradar.ui.detail.DetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelectedAsteroid((androidx.lifecycle.LiveData<com.eslammongy.asteroidradar.domain.Asteroid>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSelectedAsteroid(androidx.lifecycle.LiveData<com.eslammongy.asteroidradar.domain.Asteroid> ViewModelSelectedAsteroid, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.eslammongy.asteroidradar.domain.Asteroid viewModelSelectedAsteroidGetValue = null;
        double viewModelSelectedAsteroidDistanceFromEarth = 0.0;
        double viewModelSelectedAsteroidAbsoluteMagnitude = 0.0;
        double viewModelSelectedAsteroidRelativeVelocity = 0.0;
        boolean viewModelSelectedAsteroidPotentiallyHazardous = false;
        double viewModelSelectedAsteroidEstimatedDiameter = 0.0;
        com.eslammongy.asteroidradar.ui.detail.DetailViewModel viewModel = mViewModel;
        java.lang.String viewModelSelectedAsteroidCloseApproachDate = null;
        androidx.lifecycle.LiveData<com.eslammongy.asteroidradar.domain.Asteroid> viewModelSelectedAsteroid = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.selectedAsteroid
                    viewModelSelectedAsteroid = viewModel.getSelectedAsteroid();
                }
                updateLiveDataRegistration(0, viewModelSelectedAsteroid);


                if (viewModelSelectedAsteroid != null) {
                    // read viewModel.selectedAsteroid.getValue()
                    viewModelSelectedAsteroidGetValue = viewModelSelectedAsteroid.getValue();
                }


                if (viewModelSelectedAsteroidGetValue != null) {
                    // read viewModel.selectedAsteroid.getValue().distanceFromEarth
                    viewModelSelectedAsteroidDistanceFromEarth = viewModelSelectedAsteroidGetValue.getDistanceFromEarth();
                    // read viewModel.selectedAsteroid.getValue().absoluteMagnitude
                    viewModelSelectedAsteroidAbsoluteMagnitude = viewModelSelectedAsteroidGetValue.getAbsoluteMagnitude();
                    // read viewModel.selectedAsteroid.getValue().relativeVelocity
                    viewModelSelectedAsteroidRelativeVelocity = viewModelSelectedAsteroidGetValue.getRelativeVelocity();
                    // read viewModel.selectedAsteroid.getValue().potentiallyHazardous
                    viewModelSelectedAsteroidPotentiallyHazardous = viewModelSelectedAsteroidGetValue.isPotentiallyHazardous();
                    // read viewModel.selectedAsteroid.getValue().estimatedDiameter
                    viewModelSelectedAsteroidEstimatedDiameter = viewModelSelectedAsteroidGetValue.getEstimatedDiameter();
                    // read viewModel.selectedAsteroid.getValue().closeApproachDate
                    viewModelSelectedAsteroidCloseApproachDate = viewModelSelectedAsteroidGetValue.getCloseApproachDate();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.eslammongy.asteroidradar.adapter.BindingAdaptersKt.bindTextViewToAstronomicalUnit(this.absoluteMagnitude, viewModelSelectedAsteroidAbsoluteMagnitude);
            com.eslammongy.asteroidradar.adapter.BindingAdaptersKt.bindDetailsStatusImage(this.activityMainImageOfTheDay, viewModelSelectedAsteroidPotentiallyHazardous);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.closeApproachDate, viewModelSelectedAsteroidCloseApproachDate);
            com.eslammongy.asteroidradar.adapter.BindingAdaptersKt.bindTextViewToAstronomicalUnit(this.distanceFromEarth, viewModelSelectedAsteroidDistanceFromEarth);
            com.eslammongy.asteroidradar.adapter.BindingAdaptersKt.bindTextViewToKmUnit(this.estimatedDiameter, viewModelSelectedAsteroidEstimatedDiameter);
            com.eslammongy.asteroidradar.adapter.BindingAdaptersKt.bindTextViewToDisplayVelocity(this.relativeVelocity, viewModelSelectedAsteroidRelativeVelocity);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.selectedAsteroid
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}