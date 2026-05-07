package javaApplicationsupport;

import java.util.List;

public class Exceptionhandler {

    public ValidationResult validate(Document doc) {

        try {

            if (doc == null) {
                // FIX: specific exception
                throw new IllegalArgumentException("Document is null");
            }

            String content = doc.extractContent();

            if (content == null || content.isEmpty()) {
                // FIX: expected validation failure
                throw new IllegalArgumentException("Empty content");
            }

            return runValidationRules(content);

        } catch (IllegalArgumentException e) {

            // FIX: avoid printStackTrace
            System.out.println("Validation failed: " + e.getMessage());

            // FIX: do not return null
            return new ValidationResult(false);

        } catch (Exception e) {

            // FIX: log unexpected error
            System.out.println("Error: " + e.getMessage());

            return new ValidationResult(false);
        }
    }

    public void validateBatch(List<Document> docs) {

        for (Document doc : docs) {
            try {

                ValidationResult r = validate(doc);

                // FIX: null check
                if (r != null && r.isValid()) {
                    saveResult(r);
                }

            } catch (Exception e) {

                // FIX: do not swallow exception
                System.out.println("Batch error: " + e.getMessage());
            }
        }
    }

    private ValidationResult runValidationRules(String content) {
        return new ValidationResult(true);
    }

    private void saveResult(ValidationResult r) {
        System.out.println("Saved");
    }
}
