package com.wane.catnip.service.moment;

import com.wane.catnip.model.Image;
import com.wane.catnip.model.MomentPreview;
import com.wane.catnip.model.MomentPreviews;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import static java.util.Arrays.asList;

@Service
public class DefaultMomentService implements MomentService {
    @Override
    public MomentPreviews retrievePreviews() {
        return new MomentPreviews(asList(
                previewKitty(),
                previewMax()
        ));
    }

    private MomentPreview previewKitty() {
        MomentPreview preview = new MomentPreview("cat1");
        preview.setCat("Kitty");
        preview.setAvatar(new Image("/image/avatar1.jpg"));
        preview.setTimestamp(DateTime.now().minusMinutes(5));
        preview.setMessage("Posted some new picture.");
        preview.setThumbs(asList(
                new Image("/image/thumb1.jpg"),
                new Image("/image/thumb2.jpg"),
                new Image("/image/thumb3.jpg")
        ));
        return preview;
    }

    private MomentPreview previewMax() {
        MomentPreview preview = new MomentPreview("cat2");
        preview.setCat("Max");
        preview.setAvatar(new Image("/image/avatar2.jpg"));
        preview.setTimestamp(DateTime.now().minusMinutes(10));
        preview.setMessage("Finally I have my cat.");
        preview.setThumbs(asList(
                new Image("/image/thumb1.jpg"),
                new Image("/image/thumb2.jpg")
        ));
        return preview;
    }
}
