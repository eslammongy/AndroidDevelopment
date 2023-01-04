package com.eslammongy.asteroidradar.databinding;
import com.eslammongy.asteroidradar.R;
import com.eslammongy.asteroidradar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingImpl extends FragmentMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_main_image_of_the_day_layout, 2);
        sViewsWithIds.put(R.id.textView, 3);
        sViewsWithIds.put(R.id.asteroid_recycler, 4);
        sViewsWithIds.put(R.id.status_loading_wheel, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.FrameLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.ProgressBar) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.activityMainImageOfTheDay.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewModel((com.eslammongy.asteroidradar.ui.main.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.eslammongy.asteroidradar.ui.main.MainViewModel ViewModel) {
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
                return onChangeViewModelPictureOfTheDay((androidx.lifecycle.LiveData<com.eslammongy.asteroidradar.domain.PictureOfDay>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPictureOfTheDay(androidx.lifecycle.LiveData<com.eslammongy.asteroidradar.domain.PictureOfDay> ViewModelPictureOfTheDay, int fieldId) {
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
        com.eslammongy.asteroidradar.domain.PictureOfDay viewModelPictureOfTheDayGetValue = null;
        androidx.lifecycle.LiveData<com.eslammongy.asteroidradar.domain.PictureOfDay> viewModelPictureOfTheDay = null;
        com.eslammongy.asteroidradar.ui.main.MainViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.pictureOfTheDay
                    viewModelPictureOfTheDay = viewModel.getPictureOfTheDay();
                }
                updateLiveDataRegistration(0, viewModelPictureOfTheDay);


                if (viewModelPictureOfTheDay != null) {
                    // read viewModel.pictureOfTheDay.getValue()
                    viewModelPictureOfTheDayGetValue = viewModelPictureOfTheDay.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.eslammongy.asteroidradar.adapter.BindingAdaptersKt.bindPictureOfDayImage(this.activityMainImageOfTheDay, viewModelPictureOfTheDayGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.pictureOfTheDay
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}