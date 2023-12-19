
    private double balance;
    private double payment;
    private Date date;
    private double remainingAmount;

    public Transaction(double balance, double payment) {
        this.balance = balance;
        this.payment = payment;
        this.date = new Date();
        this.remainingAmount = balance - payment;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "Transaction on " + dateFormat.format(date) +
                ": Balance=" + balance +
                ", Payment=" + payment +
                ", Remaining Amount=" + remainingAmount;
    }
