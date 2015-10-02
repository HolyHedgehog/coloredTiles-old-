package sandbox;

public enum Settings {

    min_hard {
                @Override
                public int get() {
                    return 10;
                }
            },
    med_hard {
                @Override
                public int get() {
                    return 20;
                }
            },
    max_hard {
                @Override
                public int get() {
                    return 40;
                }
            };

    public abstract int get();
}
