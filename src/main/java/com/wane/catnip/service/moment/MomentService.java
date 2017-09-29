package com.wane.catnip.service.moment;

import com.wane.catnip.model.Moment;
import com.wane.catnip.model.MomentPreviews;

public interface MomentService {
    MomentPreviews retrievePreviews();
    Moment retrieveMoment(String id);
}
