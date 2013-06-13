class Fibonacci {
    def calculate(int amount){
        def stack = [0,1]
        (2..amount).each{ stack[it] = stack[it-2] + stack[it-1] }
        return stack
    }
}
