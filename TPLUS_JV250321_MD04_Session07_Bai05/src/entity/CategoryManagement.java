package entity;

public class CategoryManagement implements ICRUD {
    private Category[] categories = new Category[100];
    private int currentIndex = 0;

    @Override
    public Category[] findAll() {
        Category[] result = new Category[currentIndex];
        System.out.println("Danh sach danh muc:");
        for (int i = 0; i < currentIndex; i++) {
            result[i] = categories[i];
        }
        return result;
    }

    @Override
    public void addCategory(Category category) {
        categories[currentIndex] = category;
        currentIndex++;
    }

    @Override
    public void removeCategory(Category category) {
        for (int i = 0; i < currentIndex; i++) {
            if (categories[i] == category) {
                categories[i] = null;
            }
        }
    }

    @Override
    public void updateCategory(Category category) {
        for (int i = 0; i < currentIndex; i++) {
            if (categories[i].getId() == category.getId()) {
                categories[i] = category;
            }
        }
    }

    @Override
    public void deleteById(int id) {
        int deleteIndex = -1;
        for (int i = 0; i < currentIndex; i++) {
            if (categories[i].getId() == id) {
                deleteIndex = i;
                break;
            }
        }
        if (deleteIndex == -1) {
            System.out.println("Danh muc khong ton tai!");
            return;
        }
        removeCategory(categories[deleteIndex]);

        for (int i = deleteIndex; i < currentIndex - 1; i++) {
            categories[i] = categories[i + 1];
        }
        categories[currentIndex - 1] = null;
        currentIndex--;
    }


}
